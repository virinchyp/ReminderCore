package com.onesixty.seven.core.intefaces;

import com.onesixty.seven.core.objects.LocationObject;

/**
 * The Interface ICore.
 */
public interface ICore {

	/**
	 * The Enum Event.
	 */
	public static enum Event {

		/** The event all. */
		EVENT_ALL,

		/**
		 * When the current location of the device changes.
		 * 
		 * Object: LocationObject
		 */
		CURRENT_LOCATION_UPDATE,

		/**
		 * When the device enters in the radius of a saved location associated
		 * with a reminder.
		 * 
		 * Object: ReminderObject
		 */
		EVENT_ENTER_LOCATION_RADIUS,

		/**
		 * When the device exits the radius of a saved location associated with
		 * a reminder.
		 * 
		 * Object: ReminderObject
		 */
		EVENT_EXIT_LOCATION_RADIUS

	}

	/**
	 * Sets the current location.
	 * 
	 * @param newLocation
	 *            the new current location
	 */
	public void setCurrentLocation(LocationObject newLocation);

	/**
	 * Adds the listener.
	 * 
	 * @param listener
	 *            the listener
	 */
	public void addListener(Event type, IListener listener);

	/**
	 * Removes the listener.
	 * 
	 * @param listener
	 *            the listener
	 */
	public void removeListener(Event type, IListener listener);

	/**
	 * Broadcast event.
	 * 
	 * @param type
	 *            the type of the core event.
	 * @param data
	 *            the data associated with the core event.
	 */
	public void broadcastEvent(ICore.Event type, Object data);

	/**
	 * The listener interface for receiving events. The class that is interested
	 * in processing an event implements this interface, and the object created
	 * with that class is registered with a component using the component's
	 * <code>addIListener</code> method. When the event occurs, that object's
	 * appropriate method is invoked.
	 * 
	 * @see ICore
	 */
	public interface IListener {

		/**
		 * This method is called on the listeners when the location changes.
		 * 
		 * @param data
		 *            the data associated with the event.
		 */
		public void onCoreEvent(Object data);
	}

}
