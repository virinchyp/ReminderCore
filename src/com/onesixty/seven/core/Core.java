package com.onesixty.seven.core;

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

	/**
	 * Instantiates a new core.
	 */
	public Core() {

	}

	@Override
	public void setCurrentLocation(LocationObject newLocation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addListener(IListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeListener(IListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void broadcastEvent(Event type, Object data) {
		// TODO Auto-generated method stub

	}
}
