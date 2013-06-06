package com.onesixty.seven.core.intefaces;

import java.util.List;

import com.onesixty.seven.core.objects.PhoneSettingObject;
import com.onesixty.seven.core.objects.ReminderObject;
import com.onesixty.seven.core.objects.UserPreferenceObject;

/**
 * The Interface IReminderManager.
 */
public interface IUserPreferenceManager {

	/**
	 * The Enum ReminderType.
	 */
	public static enum UserPreferenceType {

		/** User Preference set for entering a location. */
		ENTER_LOCATION,

		/** User Preference set for exiting a location. */
		EXIT_LOCATION
	}

	/**
	 * Adds a reminder.
	 * 
	 * @param item
	 *            the Reminder.
	 * @return the reminder id.
	 */
	public int addPreference(UserPreferenceObject item);

	/**
	 * Modify a reminder with a given ID.
	 * 
	 * @param id
	 *            the ID of the reminder to modify.
	 * @param item
	 *            the new reminder.
	 * @return true if reminder is modified, false otherwise.
	 */
	public boolean modifyPreference(int id, UserPreferenceObject item);

	/**
	 * Delete a reminder with a given ID.
	 * 
	 * @param id
	 *            the ID of the reminder to delete.
	 * @return true if reminder is deleted, false otherwise.
	 */
	public boolean deletePreference(int id);

	/**
	 * Returns the reminder with a given ID.
	 * 
	 * @param id
	 *            the ID of the reminder to return.
	 * @return the reminder.
	 */
	public UserPreferenceObject getPreference(int id);

	/**
	 * Gets the reminders for a type.
	 * 
	 * @param type
	 *            the type of the reminder to get.
	 * @return the associated reminders for the type
	 */
	public List<UserPreferenceObject> getPreferencesForType(
			UserPreferenceType type);

	/**
	 * Returns all the reminders currently stored.
	 * 
	 * @return the <code>List</code> containing all the reminders
	 */
	public List<UserPreferenceObject> getAllPreferences();

	/**
	 * Gets the all reminders.
	 * 
	 * @return the all reminders
	 */
	public List<ReminderObject> getAllReminders();

	/**
	 * Gets the all phone setting preferences.
	 * 
	 * @return the all phone setting preferences
	 */
	public List<PhoneSettingObject> getAllPhoneSettingPreferences();

	/**
	 * Returns true if and only if reminder with this ID is present, false
	 * otherwise.
	 * 
	 * @param id
	 *            the ID of the reminder to search.
	 * @return true if and only if reminder with this ID is present, false
	 *         otherwise.
	 */
	public boolean containsPreference(int id);
}
