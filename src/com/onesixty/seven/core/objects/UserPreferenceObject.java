package com.onesixty.seven.core.objects;

/**
 * The Class UserPreferenceObject.
 */
public class UserPreferenceObject {

	/** The id. */
	protected final int id;

	/** The location. */
	protected LocationObject location;

	/**
	 * Instantiates a new user preference object.
	 * 
	 * @param theId
	 *            the the id
	 */
	public UserPreferenceObject(int theId, LocationObject theLocation) {
		this.id = theId;
		this.location = theLocation;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gets the location.
	 * 
	 * @return the location
	 */
	public LocationObject getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 * 
	 * @param location
	 *            the new location
	 */
	public void setLocation(LocationObject location) {
		this.location = location;
	}
}
