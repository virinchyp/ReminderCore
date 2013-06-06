package com.onesixty.seven.core;

import java.util.List;

import com.onesixty.seven.core.intefaces.IUserPreferenceManager;
import com.onesixty.seven.core.objects.PhoneSettingObject;
import com.onesixty.seven.core.objects.ReminderObject;
import com.onesixty.seven.core.objects.UserPreferenceObject;

/**
 * 
 * This class implements IReminderManager. It has the responsibility of managing
 * the saved reminders.
 * 
 * @author Anupam
 * 
 */
class UserPreferenceManager implements IUserPreferenceManager {

	@Override
	public int addPreference(UserPreferenceObject item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean modifyPreference(int id, UserPreferenceObject item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePreference(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserPreferenceObject getPreference(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserPreferenceObject> getPreferencesForType(
			UserPreferenceType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserPreferenceObject> getAllPreferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReminderObject> getAllReminders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneSettingObject> getAllPhoneSettingPreferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsPreference(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
