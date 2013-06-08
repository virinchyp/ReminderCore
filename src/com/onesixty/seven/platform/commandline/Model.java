package com.onesixty.seven.platform.commandline;

import java.util.Scanner;

import com.onesixty.seven.core.Core;
import com.onesixty.seven.core.intefaces.ICore;
import com.onesixty.seven.core.intefaces.ICore.Event;
import com.onesixty.seven.core.util.Util;

public class Model implements ICore.IListener {
	
	Core chutiyaCore;
	
	public Model()
	{
		chutiyaCore = new Core();
	}
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		int choice = 7;
		while(choice != 0)
		{
			System.out.println("Enter your Choice");
			System.out.println("1. Add a reminder");
			System.out.println("2. Update Location");
			System.out.println("3. Update Time");
			System.out.println("0. Exit");
			int option = Integer.parseInt(sc.next());
			switch(option)
			{
				case 0: break;
				case 1 : addReminder(sc); break;
				case 2 :
				default : System.out.println("Invalid choice");break;
			}
		}
		
	}
	
	public void addReminder(Scanner sc)
	{
		System.out.println("Enter 1. Location based, 2. Time based");
		int ch = Integer.parseInt(sc.next());
		if(ch==1) addLocationReminder(sc);
		else if (ch ==2) addTimeBasedReminder(sc);
		else System.out.println("Invalid choice");
	}
	
	public void addLocationReminder(Scanner sc)
	{
		System.out.println("Enter Reminder");
		String reminder = sc.next();
		System.out.println("Enter Location row");
		int r = Integer.parseInt(sc.next());
		System.out.println("Enter Location col");
		int c = Integer.parseInt(sc.next());
		
		LocationModel l = new LocationModel(r,c);
		long id = Util.generateId();
		
		
	}
	
	public void addTimeBasedReminder(Scanner sc)
	{
		
	}
	
	public static void main(String[] args)
	{
		if(args.length!=2)
		{
			System.out.println("Invalid command line arguments");
			System.exit(0);
		}
		try
		{
			int gridRows = Integer.parseInt(args[0]);
			int gridCols = Integer.parseInt(args[1]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exiting");
			System.exit(0);
		}
		
		
		
	}

	@Override
	public void onCoreEvent(Event type, Object data) {
		// TODO Auto-generated method stub
		
	}

}
