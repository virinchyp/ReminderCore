package com.onesixty.seven.core.intefaces;

/**
 * The Interface ICore.
 */
public interface ICore {

	/**
	 * The Enum Event.
	 */
	public static enum Event {

		/**
		 * The event all. Only used for listening to all events. Should not be
		 * used for broadcast.
		 */
		EVENT_ALL,

		/**
		 * When the current location of the device changes.
		 * 
		 * Object: ILocation
		 */
		CURRENT_LOCATION_UPDATE,

		/**
		 * When the device enters in the radius of a saved location associated
		 * with a reminder.
		 * 
		 * Object: UserPreferenceObject
		 */
		EVENT_ENTER_LOCATION_RADIUS,

		/**
		 * When the device exits the radius of a saved location associated with
		 * a reminder.
		 * 
		 * Object: UserPreferenceObject
		 */
		EVENT_EXIT_LOCATION_RADIUS

	}

	/**
	 * Sets the current location.
	 * 
	 * @param newLocation
	 *            the new current location
	 */
	public void setCurrentLocation(ILocation newLocation);

	/**
	 * Gets the reminder manager.
	 * 
	 * @return the reminder manager
	 */
	public IManager getUserPreferenceManager();

	/**
	 * Adds the listener.
	 * 
	 * @param type
	 *            the type
	 * @param listener
	 *            the listener
	 */
	public void addListener(Event type, IListener listener);

	/**
	 * Removes the listener.
	 * 
	 * @param type
	 *            the type
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
		 * @param type
		 *            the type
		 * @param data
		 *            the data associated with the event.
		 */
		public void onCoreEvent(Event type, Object data);
	}

}
