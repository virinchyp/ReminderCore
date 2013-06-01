package com.onesixty.seven.core.intefaces;

import java.util.List;

import com.onesixty.seven.core.objects.Reminder;

/**
 * The Interface IReminderManager.
 */
public interface IReminderManager {

	/**
	 * Adds a reminder.
	 * 
	 * @param item
	 *            the Reminder.
	 * @return the reminder id.
	 */
	public int addReminder(Reminder item);

	/**
	 * Modify a reminder with a given ID.
	 * 
	 * @param id
	 *            the ID of the reminder to modify.
	 * @param item
	 *            the new reminder.
	 * @return true if reminder is modified, false otherwise.
	 */
	public boolean modifyReminder(int id, Reminder item);

	/**
	 * Delete a reminder with a given ID.
	 * 
	 * @param id
	 *            the ID of the reminder to delete.
	 * @return true if reminder is deleted, false otherwise.
	 */
	public boolean deleteReminder(int id);

	/**
	 * Returns the reminder with a given ID.
	 * 
	 * @param id
	 *            the ID of the reminder to return.
	 * @return the reminder.
	 */
	public Reminder getReminder(int id);

	/**
	 * Returns all the reminders currently stored.
	 * 
	 * @return the <code>List</code> containing all the reminders
	 */
	public List<Reminder> getAllReminders();

	/**
	 * Returns true if and only if reminder with this ID is present, false
	 * otherwise.
	 * 
	 * @param id
	 *            the ID of the reminder to search.
	 * @return true if and only if reminder with this ID is present, false
	 *         otherwise.
	 */
	public boolean containsReminder(int id);
}
