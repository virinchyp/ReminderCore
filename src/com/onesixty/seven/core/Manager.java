package com.onesixty.seven.core;

import java.util.List;

import com.onesixty.seven.core.intefaces.IManager;
import com.onesixty.seven.core.objects.Notification;
import com.onesixty.seven.core.objects.PhoneSetting;
import com.onesixty.seven.core.objects.Reminder;

/**
 * 
 * This class implements IReminderManager. It has the responsibility of managing
 * the saved reminders.
 * 
 * @author Anupam
 * 
 */
class Manager implements IManager {

	@Override
	public long addNotification(Notification item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean modifyNotification(long id, Notification item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteNotification(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Notification getNotification(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notification> getAllNotifications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reminder> getAllReminderNotifications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneSetting> getAllPhoneSettingNotifications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsNotification(long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
