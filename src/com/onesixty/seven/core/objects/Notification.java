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
	protected NotificationType notificationType;

	/** The location type */
	protected LocationType locationType;

	/** proximity for location */
	protected float radius;

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

		/** The time based notification. */
		TIME_BASED,

		/** The location based notification. */
		LOCATION_BASED
	}

	/**
	 * Instantiates a new notification.
	 * 
	 * @param id
	 *            the id
	 * @param location
	 *            the location
	 */
	protected Notification(final long id, ILocation location,
			LocationType locationType) {
		this.id = id;
		this.location = location;
		this.notificationType = Notification.NotificationType.LOCATION_BASED;
	}

	/**
	 * Instantiates a new notification.
	 * 
	 * @param id
	 *            the id
	 * @param time
	 *            the time
	 */
	protected Notification(final long id, long time, LocationType locationType) {
		this.id = id;
		this.time = time;
		this.notificationType = Notification.NotificationType.TIME_BASED;
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

	/**
	 * Gets the NotificationType.
	 * 
	 * @return the type
	 */
	public NotificationType getType() {
		return notificationType;
	}

	/**
	 * Sets the NotificationType.
	 * 
	 * @param type
	 *            the new type
	 */
	public void setType(NotificationType type) {
		this.notificationType = type;
	}

}
