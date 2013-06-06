package com.onesixty.seven.platform.commandline;

public class Model {
	
	
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

}
