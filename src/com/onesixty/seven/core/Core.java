package com.onesixty.seven.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.onesixty.seven.core.intefaces.ICore;
import com.onesixty.seven.core.objects.LocationObject;

/**
 * This class is the only entry point for the platform to the core. The core is
 * responsible for keeping track of the saved reminders with respect to the
 * current location of the device. It does so by communicating with
 * <code>ReminderManager</code> and <code>LocationManager</code>.
 * 
 * @author Anupam
 * 
 */
public class Core implements ICore {

	private List<LocationObject> locations;
	private Map<ICore.Event, List<IListener>> listenerMap;

	/**
	 * Instantiates a new core.
	 */
	public Core() {
		locations = new ArrayList<>();
		listenerMap = new HashMap<ICore.Event, List<IListener>>();
	}

	@Override
	public void setCurrentLocation(LocationObject newLocation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addListener(Event type, IListener listener) {
		List<IListener> listeners = listenerMap.get(type);
		if (listeners == null) {
			listeners = new ArrayList<IListener>();
			listeners.add(listener);
		}
	}

	@Override
	public void removeListener(Event type, IListener listener) {
		List<IListener> listeners = listenerMap.get(type);
		if (listeners != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public void broadcastEvent(Event type, Object data) {
		// TODO Auto-generated method stub

	}
}
