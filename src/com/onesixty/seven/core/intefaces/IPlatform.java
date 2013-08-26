package com.onesixty.seven.core.intefaces;

/**
 * The interface implemented by platform which uses core.
 */
public interface IPlatform {

	/**
	 * Register the platform for alarm service.
	 */
	public void registerForAlarm();

	/**
	 * Deregister the platform for alarm service.
	 */
	public void deregisterForAlarm();
}
