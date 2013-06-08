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
		return (float) Math.sqrt(Math.pow(location.getLatitude()-this.row,2) + Math.pow(location.getLongitude()-this.col,2));
		
	}

	
	@Override
	public double getLatitude() {
		// TODO Auto-generated method stub
		return (double)this.row;
	}

	@Override
	public double getLongitude() {
		// TODO Auto-generated method stub
		return (double)this.col;
	}

}
