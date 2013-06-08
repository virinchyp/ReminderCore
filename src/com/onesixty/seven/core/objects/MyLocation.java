package com.onesixty.seven.core.objects;

import com.onesixty.seven.core.intefaces.ILocation;

public class MyLocation implements ILocation {

	private double latitude;
	private double longitude;

	protected MyLocation(int id, double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public float distanceTo(ILocation location) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLatitude() {
		return latitude;
	}

	@Override
	public double getLongitude() {
		return longitude;
	}
}
