package com.suchak.storage;
import java.util.List;

import com.suchak.Reminder.*;

public interface Storage {
	
	public List<Reminder>getAllReminders();
	public List<Reminder> getLocationReminder();
	public List<Reminder> getTimeReminders();
	public Reminder getReminder(int id);
}
