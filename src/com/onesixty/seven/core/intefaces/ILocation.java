package com.onesixty.seven.core.intefaces;

/**
 * The Interface ILocation.
 */
public interface ILocation {

	/**
	 * The Enum NotificationType.
	 */
	public static enum LocationType {

		/** Notification set for entering a location. */
		ENTER_LOCATION,

		/** Notification set for exiting a location. */
		EXIT_LOCATION
	}

	/**
	 * Get the LocationType
	 * 
	 * @return the LocationType
	 */
	public LocationType getLocationType();

	/**
	 * Sets the LocationType.
	 * 
	 * @param locationType
	 *            the new LocationType
	 */
	public void setLocationType(LocationType locationType);

	/**
	 * Returns the approximate distance in meters between this location and the
	 * given location.
	 * 
	 * @param location
	 *            the location
	 * @return the distance
	 */
	float distanceTo(ILocation location);

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

	/**
	 * Gets the radius with this location
	 * 
	 * @return
	 */
	float getRadius();
}
