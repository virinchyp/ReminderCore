package com.onesixty.seven.core.intefaces;

/**
 * The interface implemented by platform.
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
	
	/**
	 * Get the storage component of the platform.
	 */
	public IStorage getPlatformStorage();
}
