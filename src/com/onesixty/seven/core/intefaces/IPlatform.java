package com.onesixty.seven.core.intefaces;

/**
 * The interface implemented by platform.
 */
public interface IPlatform {

	/**
	 * Interface implemented by the listener to the platform.
	 */
	public interface IListener {
		/**
		 * Notify listener of the alarm.
		 */
		public void notifyAlarm();
	}

	/**
	 * Set the listener to the platform.
	 * 
	 * @param listener
	 *            the IListener.
	 */
	public void setListener(IListener listener);

	/**
	 * Register the platform for alarm service.
	 */
	public void registerForAlarm();

	/**
	 * Deregister the platform for alarm service.
	 */
	public void deregisterForAlarm();
}
