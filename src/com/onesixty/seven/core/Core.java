package com.onesixty.seven.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.onesixty.seven.core.intefaces.ICore;
import com.onesixty.seven.core.intefaces.ILocation;
import com.onesixty.seven.core.intefaces.IStorageProvider;
import com.onesixty.seven.core.objects.Notification;
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
	private List<ILocation> savedLocations;

	/** The listener map. */
	private Map<ICore.Event, List<IListener>> listenerMap;

	/** The last location. */
	private ILocation lastLocation;

	/** The current location. */
	private ILocation currentLocation;

	/** The reminder manager. */
	private IStorageProvider storage;

	/**
	 * Instantiates a new core.
	 */
	public Core(IStorageProvider platformStorage) {
		savedLocations = new ArrayList<ILocation>();
		listenerMap = new HashMap<ICore.Event, List<IListener>>();
		storage = platformStorage;
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
		lastLocation = currentLocation;
		currentLocation = newLocation;
		// TODO getProximityLocationFor(newLocation);
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
			listeners.add(listener);
		}
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
		return storage.addNotification(item);
	}

	@Override
	public boolean modifyNotification(long id, Notification item) {
		return modifyNotification(id, item);
	}

	@Override
	public boolean deleteNotification(long id) {
		return deleteNotification(id);
	}

	@Override
	public Notification getNotification(long id) {
		return getNotification(id);
	}

	@Override
	public List<Notification> getAllNotifications() {
		return getAllNotifications();
	}

	@Override
	public List<Reminder> getAllReminderNotifications() {
		return getAllReminderNotifications();
	}

	@Override
	public List<PhoneSetting> getAllPhoneSettingNotifications() {
		return getAllPhoneSettingNotifications();
	}

	@Override
	public boolean containsNotification(long id) {
		return containsNotification(id);
	}

	/**
	 * Gets the proximity location for.
	 * 
	 * @param location
	 *            the location
	 * @return the proximity location for
	 */
	private ILocation getProximityLocationFor(ILocation location) {
		// TODO
		return null;
	}
}
