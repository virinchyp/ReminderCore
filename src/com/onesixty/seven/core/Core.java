package com.onesixty.seven.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.onesixty.seven.core.intefaces.ICore;
import com.onesixty.seven.core.intefaces.ILocation;
import com.onesixty.seven.core.intefaces.IPlatform;
import com.onesixty.seven.core.intefaces.IStorageProvider;
import com.onesixty.seven.core.objects.Notification;
import com.onesixty.seven.core.objects.Notification.LocationType;
import com.onesixty.seven.core.objects.PhoneSetting;
import com.onesixty.seven.core.objects.Reminder;

/**
 * This class is the only entry point for the platform to the core. The core is
 * responsible for keeping track of the saved locations related to the reminders
 * and firing off events when the current location enters or exits the saved
 * location. It does so by communicating with <code>ReminderManager</code>.
 * 
 * @author Anupam
 * 
 */
public class Core implements ICore {

	/** The locations. */
	private HashMap<Long, ILocation> savedLocations;

	/** The listener map. */
	private Map<ICore.Event, List<IListener>> listenerMap;

	/** The last location. */
	private ILocation lastLocation;

	/** The current location. */
	private ILocation currentLocation;

	/** The reminder manager. */
	private IStorageProvider storage;

	/** The platform. */
	private IPlatform platform;

	/**
	 * Instantiates a new core.
	 */
	public Core(IStorageProvider platformStorage) {
		savedLocations = new HashMap<Long, ILocation>();
		listenerMap = new HashMap<ICore.Event, List<IListener>>();
		storage = platformStorage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.onesixty.seven.core.intefaces.ICore#setPlatform(com.onesixty.seven
	 * .core.intefaces.IPlatform)
	 */
	@Override
	public void setPlatform(IPlatform platform) {
		this.platform = platform;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.onesixty.seven.core.intefaces.ICore#setCurrentLocation(com.onesixty
	 * .seven.core.objects.LocationObject)
	 */
	@Override
	public void setCurrentLocation(ILocation newLocation) {
		/** get locations that are in radius */
		List<Long> lastList = this.getNotificationsForLocation(lastLocation);
		List<Long> currentList = this.getNotificationsForLocation(currentLocation);
		/** update last and current location */
		lastLocation = currentLocation;
		currentLocation = newLocation;
		/** get the difference of list */
		List<Long> enterList = this.differenceList(currentList,lastList);
		List<Long> exitList = this.differenceList(lastList,currentList);
		/** Current - Last = enter events only */
		Iterator<Long> it = enterList.iterator();
		while (it.hasNext()) {
			long id = it.next();
			Notification notification = this.getNotification(id);
			LocationType type = notification.getLocationType();
			if(type!=null && type.equals(LocationType.ENTER_LOCATION)) {
				this.broadcastEvent(ICore.Event.EVENT_ENTER_LOCATION_RADIUS,notification);
				savedLocations.remove(id);
			}
		}
		/** last - current = exit events only */
		it = exitList.iterator();
		while (it.hasNext()) {
			long id = it.next();
			Notification notification = this.getNotification(id);
			LocationType type = notification.getLocationType();
			if(type!=null && type.equals(LocationType.EXIT_LOCATION)) {
				this.broadcastEvent(ICore.Event.EVENT_EXIT_LOCATION_RADIUS,notification);
				savedLocations.remove(id);
			}
		}
	}
	
	
	private List<Long> differenceList(List<Long> a, List<Long> b)
	{
		List<Long> difference = new ArrayList<Long>();
		for (Long long1 : a) {
			if(!b.contains(long1)) difference.add(long1);
		}
		return difference;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.onesixty.seven.core.intefaces.ICore#addListener(com.onesixty.seven
	 * .core.intefaces.ICore.Event,
	 * com.onesixty.seven.core.intefaces.ICore.IListener)
	 */
	@Override
	public void addListener(Event type, IListener listener) {
		List<IListener> listeners = listenerMap.get(type);
		if (listeners == null) {
			listeners = new ArrayList<IListener>();
		}
		listeners.add(listener);
		listenerMap.put(type, listeners);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.onesixty.seven.core.intefaces.ICore#removeListener(com.onesixty.seven
	 * .core.intefaces.ICore.Event,
	 * com.onesixty.seven.core.intefaces.ICore.IListener)
	 */
	@Override
	public void removeListener(Event type, IListener listener) {
		List<IListener> listeners = listenerMap.get(type);
		if (listeners != null) {
			listeners.remove(listener);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.onesixty.seven.core.intefaces.ICore#broadcastEvent(com.onesixty.seven
	 * .core.intefaces.ICore.Event, java.lang.Object)
	 */
	@Override
	public void broadcastEvent(Event type, Object data) {

		List<IListener> listeners = listenerMap.get(Event.EVENT_ALL);
		if (listeners != null) {
			for (IListener listener : listeners) {
				listener.onCoreEvent(type, data);
			}
		}

		listeners = listenerMap.get(type);
		if (listeners != null) {
			for (IListener listener : listeners) {
				listener.onCoreEvent(type, data);
			}
		}
	}

	@Override
	public long addNotification(Notification item) {
		if (item.getType() == Notification.Type.LOCATION_BASED)
			this.savedLocations.put(item.getId(), item.getLocation());
		return storage.addNotification(item);
	}

	@Override
	public boolean modifyNotification(long id, Notification item) {
		return storage.modifyNotification(id, item);
	}

	@Override
	public boolean deleteNotification(long id) {
		this.savedLocations.remove(id);
		return storage.deleteNotification(id);
	}

	@Override
	public Notification getNotification(long id) {
		return storage.getNotification(id);
	}

	@Override
	public List<Notification> getAllNotifications() {
		return storage.getAllNotifications();
	}

	@Override
	public List<Reminder> getAllReminderNotifications() {
		return storage.getAllReminderNotifications();
	}

	@Override
	public List<PhoneSetting> getAllPhoneSettingNotifications() {
		return storage.getAllPhoneSettingNotifications();
	}

	@Override
	public boolean containsNotification(long id) {
		return storage.containsNotification(id);
	}

	/**
	 * This function is used to get list of notifications id if the given
	 * location is under proximity of any of the saved locations
	 * 
	 * @param location
	 * @return List of notification id
	 */
	private List<Long> getNotificationsForLocation(ILocation location) {
		List<Long> ids = new ArrayList<Long>();
		Iterator<Long> it = this.savedLocations.keySet().iterator();
		while (it.hasNext()) {
			long id = it.next();
			ILocation loc = this.savedLocations.get(id);
			float distance = loc.distanceTo(location);
			if (distance <= loc.getRadius()) {
				ids.add(id);
			}
		}
		return ids;
	}
}
