package com.onesixty.seven.core.objects;

import com.onesixty.seven.core.intefaces.ILocation;

/**
 * The Class Notification.
 */
public class Notification {

	/** The id. */
	protected final long id;

	/** The location. */
	protected ILocation location;

	/** The time. */
	protected long time;

	/** The notification type. */
	protected NotificationType type;

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
	 * The Enum NotificationType.
	 */
	public static enum NotificationType {

		/** The time based notiation. */
		TIME_BASED,

		/** The location based notiation. */
		LOCATION_BASED
	}

	/**
	 * Instantiates a new notification.
	 * 
	 * @param id
	 *            the id
	 * @param location
	 *            the location
	 * @param time
	 *            the time
	 */
	protected Notification(final long id, ILocation location, long time,
			NotificationType type) {
		this.id = id;
		this.location = location;
		this.time = time;
		this.type = type;
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

	/**
	 * Gets the time.
	 * 
	 * @return the time
	 */
	public long getTime() {
		return time;
	}

	/**
	 * Sets the time.
	 * 
	 * @param time
	 *            the new time
	 */
	public void setTime(long time) {
		this.time = time;
	}
}
