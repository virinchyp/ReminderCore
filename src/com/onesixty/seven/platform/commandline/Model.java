package com.onesixty.seven.platform.commandline;

import com.onesixty.seven.core.intefaces.ICore;
import com.onesixty.seven.core.intefaces.ICore.Event;

public class Model implements ICore.IListener {
	
	public void start(Character endCh)
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
