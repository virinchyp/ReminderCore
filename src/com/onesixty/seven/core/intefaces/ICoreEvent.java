package com.onesixty.seven.core.intefaces;

/**
 * The Interface ICoreEvent.
 */
public interface ICoreEvent {

	/**
	 * The Enum Event.
	 */
	public static enum Event {

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
		EVENT_ENTER_LOCATION,

		/**
		 * When the device exits the radius of a saved location associated with
		 * a reminder.
		 * 
		 * Object: ReminderObject
		 */
		EVENT_EXIT_LOCATION

	}

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
	public void broadcastEvent(ICoreEvent.Event type, Object data);

	/**
	 * The listener interface for receiving events. The class that is interested
	 * in processing an event implements this interface, and the object created
	 * with that class is registered with a component using the component's
	 * <code>addIListener</code> method. When the event occurs, that object's
	 * appropriate method is invoked.
	 * 
	 * @see ICoreEvent
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
