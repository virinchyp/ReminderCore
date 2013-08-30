package com.onesixty.seven.platform.commandline;

import com.onesixty.seven.core.intefaces.ILocation;

public class LocationModel implements ILocation {

	protected int row;
	protected int col;
	protected float radius;

	protected int MaxRow;
	protected int MaxCol;

	public LocationModel(int row, int col, int Mrow, int Mcol, int r) {
		this.row = row;
		this.col = col;
		this.MaxCol = Mcol;
		this.MaxRow = Mrow;
		this.radius = r;
	}

	@Override
	public float distanceTo(ILocation location) {
		return (float) Math.sqrt(Math.pow(location.getLatitude() - this.row, 2)
				+ Math.pow(location.getLongitude() - this.col, 2));

	}

	@Override
	public double getLatitude() {
		// TODO Auto-generated method stub
		return (double) this.row;
	}

	@Override
	public double getLongitude() {
		// TODO Auto-generated method stub
		return (double) this.col;
	}

	@Override
	public float getRadius() {
		// TODO Auto-generated method stub
		return this.radius;
	}

	@Override
	public LocationType getLocationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocationType(LocationType locationType) {
		// TODO Auto-generated method stub

	}

}
