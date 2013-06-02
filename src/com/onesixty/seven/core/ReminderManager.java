package com.onesixty.seven.core;

import java.util.List;

import com.onesixty.seven.core.intefaces.IReminderManager;
import com.onesixty.seven.core.objects.ReminderObject;

/**
 * 
 * This class implements IReminderManager. It has the responsibility of managing
 * the saved reminders.
 * 
 * @author Anupam
 * 
 */
class ReminderManager implements IReminderManager {

	@Override
	public int addReminder(ReminderObject item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean modifyReminder(int id, ReminderObject item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteReminder(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReminderObject getReminder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReminderObject> getRemindersForType(ReminderType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReminderObject> getAllReminders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsReminder(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
