package com.onesixty.seven.platform.commandline;

import com.onesixty.seven.core.intefaces.ILocation;

public class LocationModel implements ILocation {
	
	protected int row;
	protected int col;
	
	protected int MaxRow;
	protected int MaxCol;
	
	public LocationModel(int row, int col,int Mrow, int Mcol)
	{
		this.row = row;
		this.col = col;
		this.MaxCol = Mcol;
		this.MaxRow = Mrow;
	}

	@Override
	public float distanceTo(ILocation location) {
		
		return 0;
	}

	@Override
	public float getAltitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLatitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLongitude() {
		// TODO Auto-generated method stub
		return 0;
	}

}
