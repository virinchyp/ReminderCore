package com.onesixty.seven.core.intefaces;

import java.util.List;

import com.onesixty.seven.core.objects.PhoneSettingObject;
import com.onesixty.seven.core.objects.PreferenceObject;
import com.onesixty.seven.core.objects.ReminderObject;

/**
 * The Interface IUserPreferenceManager.
 */
public interface IManager {

	/**
	 * The Enum UserPreferenceType.
	 */
	public static enum PreferenceType {

		/** User Preference set for entering a location. */
		ENTER_LOCATION,

		/** User Preference set for exiting a location. */
		EXIT_LOCATION
	}

	/**
	 * Adds a user preference.
	 * 
	 * @param item
	 *            the user preference.
	 * @return the user preference id.
	 */
	public int addPreference(PreferenceObject item);

	/**
	 * Modify a user preference with a given ID.
	 * 
	 * @param id
	 *            the ID of the user preference to modify.
	 * @param item
	 *            the new user preference.
	 * @return true if user preference is modified, false otherwise.
	 */
	public boolean modifyPreference(int id, PreferenceObject item);

	/**
	 * Delete a user preference with a given ID.
	 * 
	 * @param id
	 *            the ID of the user preference to delete.
	 * @return true if user preference is deleted, false otherwise.
	 */
	public boolean deletePreference(int id);

	/**
	 * Returns the user preference with a given ID.
	 * 
	 * @param id
	 *            the ID of the user preference to return.
	 * @return the user preference.
	 */
	public PreferenceObject getPreference(int id);

	/**
	 * Gets the user preference for a type.
	 * 
	 * @param type
	 *            the type of the user preference to get.
	 * @return the associated user preference for the type
	 */
	public List<PreferenceObject> getPreferencesForType(PreferenceType type);

	/**
	 * Returns all the user preferences currently stored.
	 * 
	 * @return the <code>List</code> containing all the user preference
	 */
	public List<PreferenceObject> getAllPreferences();

	/**
	 * Gets the all reminders currently stored.
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
	 * Returns true if and only if user preference with this ID is present,
	 * false otherwise.
	 * 
	 * @param id
	 *            the ID of the user preference to search.
	 * @return true if and only if user preference with this ID is present,
	 *         false otherwise.
	 */
	public boolean containsPreference(int id);
}
