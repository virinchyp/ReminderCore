package com.onesixty.seven.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.onesixty.seven.core.intefaces.ICore;
import com.onesixty.seven.core.intefaces.IReminderManager;
import com.onesixty.seven.core.objects.LocationObject;

/**
 * This class is the only entry point for the platform to the core. The core is
 * responsible for keeping track of the saved locations related to the reminders
 * and firing off events when the current location enters or exits the saved
 * location. It does so by communicating with <code>ReminderManager</code> and
 * <code>LocationManager</code>.
 * 
 * @author Anupam
 * 
 */
public class Core implements ICore {

	/** The locations. */
	private List<LocationObject> locations;

	/** The listener map. */
	private Map<ICore.Event, List<IListener>> listenerMap;

	/** The last location. */
	private LocationObject lastLocation;

	/** The current location. */
	private LocationObject currentLocation;

	/** The reminder manager. */
	private IReminderManager reminderManager;

	/**
	 * Instantiates a new core.
	 */
	public Core() {
		locations = new ArrayList<>();
		listenerMap = new HashMap<ICore.Event, List<IListener>>();
		// reminderManager = new ReminderManager();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.onesixty.seven.core.intefaces.ICore#setCurrentLocation(com.onesixty
	 * .seven.core.objects.LocationObject)
	 */
	@Override
	public void setCurrentLocation(LocationObject newLocation) {
		lastLocation = currentLocation;
		currentLocation = newLocation;
		// TODO getProximityLocationFor(newLocation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.onesixty.seven.core.intefaces.ICore#getReminderManager()
	 */
	@Override
	public IReminderManager getReminderManager() {
		return reminderManager;
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

	/**
	 * Gets the proximity location for.
	 * 
	 * @param location
	 *            the location
	 * @return the proximity location for
	 */
	private LocationObject getProximityLocationFor(LocationObject location) {
		// TODO
		return null;
	}
}
