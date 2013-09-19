package com.onesixty.seven.platform.commandline;

import java.util.Scanner;

import com.onesixty.seven.core.Core;
import com.onesixty.seven.core.intefaces.ICore;
import com.onesixty.seven.core.intefaces.ICore.Event;
import com.onesixty.seven.core.intefaces.ILocation;
import com.onesixty.seven.core.intefaces.IPlatform;
import com.onesixty.seven.core.intefaces.IStorage;
import com.onesixty.seven.core.objects.Notification;
import com.onesixty.seven.core.objects.Reminder;
import com.onesixty.seven.core.util.Util;

public class Model implements ICore.IListener {

	IPlatform platform;

	Core chutiyaCore;
	int maxRow;
	int maxCol;

	public Model(int mRow, int mCol) {
		this.platform = new Platform();		
		chutiyaCore = new Core(this.platform);
		this.chutiyaCore.addListener(ICore.Event.EVENT_ENTER_LOCATION_RADIUS, this);
		this.maxRow = mRow;
		this.maxCol = mCol;
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		this.updateLocation(sc);
		int choice = 7;
		while (choice != 0) {
			System.out.println("Enter your Choice");
			System.out.println("1. Add a reminder");
			System.out.println("2. Update Location");
			System.out.println("3. Update Time");
			System.out.println("0. Exit");
			choice = Integer.parseInt(sc.next());
			switch (choice) {
			case 0:
				System.out.println("Exiting");
				break;
			case 1:
				addReminder(sc);
				break;
			case 2:
				updateLocation(sc);
				break;
			case 3:
				updateTime(sc);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}

	}

	public void addReminder(Scanner sc) {
		System.out.println("Enter 1. Location based, 2. Time based");
		int ch = Integer.parseInt(sc.next());
		if (ch == 1)
			addLocationReminder(sc);
		// else if (ch ==2) addTimeBasedReminder(sc);
		else
			System.out.println("Invalid choice");
	}

	public void addLocationReminder(Scanner sc) {
		System.out.println("Enter Reminder");
		String reminder = sc.next();
		System.out.println("Enter Location row");
		int r = Integer.parseInt(sc.next());
		System.out.println("Enter Location col");
		int c = Integer.parseInt(sc.next());

		ILocation l = new LocationModel(r, c, this.maxRow, this.maxCol, 5);
		long id = Util.generateId();

		Notification item = new Reminder(id, l, reminder);
		this.chutiyaCore.addNotification(item);
	}

	public void updateLocation(Scanner sc) {
		System.out.println("Enter row:");
		int r = Integer.parseInt(sc.next());
		System.out.println("Enter col:");
		int c = Integer.parseInt(sc.next());
		ILocation l = new LocationModel(r, c, this.maxRow, this.maxCol, 1);
		this.chutiyaCore.setCurrentLocation(l);
	}

	public void updateTime(Scanner sc) {

	}

	public void addTimeBasedReminder(Scanner sc) {

	}

	public static void main(String[] args) {
		int gridRows = 0;
		int gridCols = 0;
		if (args.length != 2) {
			System.out.println("Invalid command line arguments");
			System.exit(0);
		}
		try {
			gridRows = Integer.parseInt(args[0]);
			gridCols = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exiting");
			System.exit(0);
		}

		Model m = new Model(gridRows, gridCols);
		m.start();

	}

	@Override
	public void onCoreEvent(Event type, Object data) {
		if (type == ICore.Event.EVENT_ENTER_LOCATION_RADIUS) {
			System.out.println(((Reminder) data).getMessage());
		}

	}

}
