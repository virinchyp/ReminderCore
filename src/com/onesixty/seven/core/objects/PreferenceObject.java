package com.onesixty.seven.core.objects;

import com.onesixty.seven.core.intefaces.ILocation;

/**
 * The Class UserPreferenceObject.
 */
public class PreferenceObject {

	/** The id. */
	protected final int id;

	/** The location. */
	protected ILocation location;

	/**
	 * Instantiates a new user preference object.
	 * 
	 * @param theId
	 *            the the id
	 */
	public PreferenceObject(int theId, ILocation theLocation) {
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
	public ILocation getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 * 
	 * @param location
	 *            the new location
	 */
	public void setLocation(ILocation location) {
		this.location = location;
	}
}
