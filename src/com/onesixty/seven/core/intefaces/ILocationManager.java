package com.onesixty.seven.core.intefaces;

import com.onesixty.seven.core.objects.LocationObject;

/**
 * The Interface ILocationManager.
 */
public interface ILocationManager {

	/**
	 * Adds the listener.
	 * 
	 * @param listener
	 *            the listener
	 */
	public void addListener(IListener listener);

	/**
	 * Removes the listener.
	 * 
	 * @param listener
	 *            the listener
	 */
	public void removeListener(IListener listener);

	/**
	 * Broadcast event.
	 * 
	 * @param type
	 *            the type of the core event.
	 * @param data
	 *            the data associated with the core event.
	 */
	public void broadcastEvent(LocationObject newLocation);

	/**
	 * The listener interface for receiving events. The class that is interested
	 * in processing an event implements this interface, and the object created
	 * with that class is registered with a component using the component's
	 * <code>addIListener</code> method. When the event occurs, that object's
	 * appropriate method is invoked.
	 * 
	 * @see IEvent
	 */
	public interface IListener {

		/**
		 * This method is called on the listeners when the location changes.
		 * 
		 * @param data
		 *            the new location
		 */
		public void onLocationChange(LocationObject newLocation);
	}
}
