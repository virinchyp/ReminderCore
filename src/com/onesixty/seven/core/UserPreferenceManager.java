package com.onesixty.seven.core;

import java.util.List;

import com.onesixty.seven.core.intefaces.IManager;
import com.onesixty.seven.core.objects.PhoneSetting;
import com.onesixty.seven.core.objects.Reminder;
import com.onesixty.seven.core.objects.PreferenceObject;

/**
 * 
 * This class implements IReminderManager. It has the responsibility of managing
 * the saved reminders.
 * 
 * @author Anupam
 * 
 */
class UserPreferenceManager implements IManager {

	@Override
	public int addPreference(PreferenceObject item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean modifyPreference(int id, PreferenceObject item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePreference(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PreferenceObject getPreference(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PreferenceObject> getPreferencesForType(
			PreferenceType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PreferenceObject> getAllPreferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reminder> getAllReminders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneSetting> getAllPhoneSettingPreferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsPreference(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
