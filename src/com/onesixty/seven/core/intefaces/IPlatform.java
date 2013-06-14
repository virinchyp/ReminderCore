package com.onesixty.seven.core.intefaces;

/**
 * The interface implemented by platform side which is going to use core.
 */
public interface IPlatform {

	/**
	 * Inform the platform to register for alarm service.
	 */
	public void registerForAlarm();
}
