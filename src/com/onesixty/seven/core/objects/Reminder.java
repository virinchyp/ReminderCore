package com.onesixty.seven.core.objects;

import com.onesixty.seven.core.intefaces.ILocation;

/**
 * The Class Reminder.
 */
public class Reminder extends Notification {

	/** The message. */
	private String message;

	public Reminder(long id, ILocation location, long time, String message,
			NotificationType type) {
		super(id, location, time, type);
		this.message = message;
	}

	/**
	 * Gets the message.
	 * 
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 * 
	 * @param message
	 *            the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Reminder) ? this.id == ((Reminder) obj).id
				: false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return message;
	}
}
