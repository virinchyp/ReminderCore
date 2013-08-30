package com.onesixty.seven.core.intefaces;

import java.util.List;

import com.onesixty.seven.core.objects.Notification;
import com.onesixty.seven.core.objects.PhoneSetting;
import com.onesixty.seven.core.objects.Reminder;

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
		 * Object: Notification
		 */
		EVENT_ENTER_LOCATION_RADIUS,

		/**
		 * When the device exits the radius of a saved location associated with
		 * a reminder.
		 * 
		 * Object: Notification
		 */
		EVENT_EXIT_LOCATION_RADIUS,

		/**
		 * When a time based reminder goes off.
		 * 
		 * Object: Notification
		 */
		EVENT_TIME_REMINDER
	}

	/**
	 * Set the platform object for the core.
	 * 
	 * @param platform
	 *            the IPlatform object
	 */
	public void setPlatform(IPlatform platform);

	/**
	 * Sets the current location.
	 * 
	 * @param newLocation
	 *            the new current location
	 */
	public void setCurrentLocation(ILocation newLocation);

	/**
	 * Notify core about the alarm that went off.
	 */
	public void notifyAlarm();

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
	 * Adds a notification.
	 * 
	 * @param item
	 *            the notification.
	 * @return the notification id.
	 */
	public long addNotification(Notification item);

	/**
	 * Modify a notification with a given ID.
	 * 
	 * @param id
	 *            the ID of the notification to modify.
	 * @param item
	 *            the new notification.
	 * @return true if notification is modified, false otherwise.
	 */
	public boolean modifyNotification(long id, Notification item);

	/**
	 * Delete a notification with a given ID.
	 * 
	 * @param id
	 *            the ID of the notification to delete.
	 * @return true if notification is deleted, false otherwise.
	 */
	public boolean deleteNotification(long id);

	/**
	 * Returns the notification with a given ID.
	 * 
	 * @param id
	 *            the ID of the notification to return.
	 * @return the notification.
	 */
	public Notification getNotification(long id);

	/**
	 * Returns all the notifications currently stored.
	 * 
	 * @return the <code>List</code> containing all the notification
	 */
	public List<Notification> getAllNotifications();

	/**
	 * Gets the all reminders currently stored.
	 * 
	 * @return the all reminders
	 */
	public List<Reminder> getAllReminderNotifications();

	/**
	 * Gets the all phone setting notifications.
	 * 
	 * @return the all phone setting notifications
	 */
	public List<PhoneSetting> getAllPhoneSettingNotifications();

	/**
	 * Returns true if and only if notification with this ID is present, false
	 * otherwise.
	 * 
	 * @param id
	 *            the ID of the notification to search.
	 * @return true if and only if notification with this ID is present, false
	 *         otherwise.
	 */
	public boolean containsNotification(long id);

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
