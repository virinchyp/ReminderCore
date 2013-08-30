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
	protected Type notificationType;

	/** Proximity for location. */
	protected float radius;

	/**
	 * Flag to check if current location has exited the radius of the location
	 * associated with this location.
	 */
	protected Boolean exitFlag;

	/**
	 * The Enum NotificationType.
	 */
	public static enum Type {

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
	protected Notification(final long id, ILocation location) {
		this.id = id;
		this.location = location;
		this.exitFlag = null;
		this.notificationType = Notification.Type.LOCATION_BASED;
	}

	/**
	 * Instantiates a new notification.
	 * 
	 * @param id
	 *            the id
	 * @param time
	 *            the time
	 */
	protected Notification(final long id, long time) {
		this.id = id;
		this.time = time;
		this.exitFlag = null;
		this.notificationType = Notification.Type.TIME_BASED;

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
	 * @return the NotificationType
	 */
	public Type getType() {
		return notificationType;
	}

	/**
	 * Sets the NotificationType.
	 * 
	 * @param type
	 *            the new NotificationType
	 */
	public void setType(Type type) {
		this.notificationType = type;
	}

	/**
	 * Gets the exited radius flag value.
	 * 
	 * @return true if the current location has exited the radius of this
	 *         notification, false otherwise
	 */
	public Boolean getExitFlag() {
		return exitFlag;
	}

	/**
	 * Sets the exited radius flag value.
	 * 
	 * @param exitedRadius
	 *            the new exited radius flag value.
	 */
	public void setExitFlag(Boolean exitFlag) {
		this.exitFlag = exitFlag;
	}
}
