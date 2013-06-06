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

	/**
	 * Proximity distance from current location to trigger reminder found event.
	 */
	protected float proximityDistance;

	/**
	 * Notify user of the preference.
	 */
	protected boolean notifyUser;

	/**
	 * Instantiates a new user preference object.
	 * 
	 * @param theId
	 *            the the id
	 * @param theLocation
	 *            the the location
	 * @param pDistance
	 *            the distance
	 * @param notifyUser
	 *            the notify user
	 */
	public PreferenceObject(long theId, ILocation theLocation, float pDistance,
			boolean notifyUser) {
		this.id = theId;
		this.location = theLocation;
		this.proximityDistance = pDistance;
		this.notifyUser = notifyUser;
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
	 * Gets the proximity distance.
	 * 
	 * @return the proximity distance
	 */
	public float getProximityDistance() {
		return proximityDistance;
	}

	/**
	 * Sets the proximity distance.
	 * 
	 * @param proximityDistance
	 *            the new proximity distance
	 */
	public void setProximityDistance(float proximityDistance) {
		this.proximityDistance = proximityDistance;
	}

	/**
	 * Should notify user?
	 * 
	 * @return true, for notifying user, false otherwise
	 */
	public boolean isNotifyUser() {
		return notifyUser;
	}

	/**
	 * Sets the notify user value.
	 * 
	 * @param notifyUser
	 *            the new notify user value
	 */
	public void setNotifyUser(boolean notifyUser) {
		this.notifyUser = notifyUser;
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
