package com.onesixty.seven.core.intefaces;

/**
 * The Interface ILocation.
 */
public interface ILocation {

	/**
	 * Returns the approximate distance in meters between this location and the
	 * given location.
	 * 
	 * @param location
	 *            the location
	 * @return the float
	 */
	float distanceTo(ILocation location);

	/**
	 * Gets the altitude.
	 * 
	 * @return the altitude
	 */
	float getAltitude();

	/**
	 * Gets the latitude.
	 * 
	 * @return the latitude
	 */
	double getLatitude();

	/**
	 * Gets the longitude.
	 * 
	 * @return the longitude
	 */
	double getLongitude();
}
