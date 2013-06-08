package com.onesixty.seven.platform.commandline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.onesixty.seven.core.intefaces.IStorageProvider;
import com.onesixty.seven.core.objects.Notification;
import com.onesixty.seven.core.objects.PhoneSetting;
import com.onesixty.seven.core.objects.Reminder;

public class StorageModel implements IStorageProvider{

	protected HashMap<Long,Notification> items;
	
	public StorageModel()
	{
		items = new HashMap<Long,Notification>();
	}
	@Override
	public long addNotification(Notification item) {
		items.put(item.getId(), item);
		return item.getId();
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
		ArrayList<Notification> all = new ArrayList<Notification>();
		Iterator<Long> it = this.items.keySet().iterator();
		while(it.hasNext())
			all.add(this.items.get(it.next()));
		return all;
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
