package com.onesixty.seven.core.objects;

import com.onesixty.seven.core.intefaces.ILocation;

/**
 * The Class UserPreferenceObject.
 */
public class PreferenceObject {

	/** The id. */
	protected final long id;

	/** The location. */
	protected ILocation location;
	
	/** proximity distance from current location
	 * to trigger reminder found event */
	protected float proximityDistance;

	/**
	 * Instantiates a new user preference object.
	 * 
	 * @param theId
	 *            the the id
	 */
	public PreferenceObject(long theId, ILocation theLocation, float pDistance) {
		this.id = theId;
		this.location = theLocation;
		this.proximityDistance = pDistance;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public long getId() {
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
