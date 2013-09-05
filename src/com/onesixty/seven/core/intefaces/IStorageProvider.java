package com.onesixty.seven.core.intefaces;

import java.util.List;

import com.onesixty.seven.core.objects.Notification;
import com.onesixty.seven.core.objects.PhoneSetting;
import com.onesixty.seven.core.objects.Reminder;

/**
 * The Interface IManager.
 */
public interface IStorageProvider {

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
	 * Returns the notification with the given ID or <code>null</code> if no
	 * notification is found.
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
}
