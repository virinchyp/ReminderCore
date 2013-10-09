package com.onesixty.seven.core.objects;

import com.onesixty.seven.core.intefaces.ILocation;

/**
 * The Class Reminder.
 */
public class Reminder extends Notification {

	/** The message. */
	private String message;

	/**
	 * Constructor to make a reminder based on location.
	 *
	 * @param id the id
	 * @param title the title
	 * @param location the location
	 * @param message the message
	 */
	public Reminder(final long id, final String title, ILocation location, String message) {
		super(id, title, location);
		this.message = message;
	}

	/**
	 * Constructor to make a reminder based on time.
	 *
	 * @param id the id
	 * @param title the title
	 * @param time the time
	 * @param message the message
	 */
	public Reminder(final long id, final String title, long time, String message) {
		super(id, title, time);
		this.message = message;
	}
	
	/**
	 * Constructor to make a reminder based on neither time nor location.
	 *
	 * @param id the id
	 * @param message the message
	 */
	public Reminder(long id, final String title, String message) {
		super(id, title);
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
		return (obj instanceof Reminder) ? this.id == ((Reminder) obj).id : false;
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
