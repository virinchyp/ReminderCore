package com.onesixty.seven.core.objects;

import java.util.ArrayList;
import java.util.List;

import com.onesixty.seven.core.intefaces.ILocation;

/**
 * The Class Checklist.
 */
public class Checklist extends Notification {
	
	/** The check list. */
	private List<Todo> checkList;
	
	/**
	 * Instantiates a new checklist based on time.
	 *
	 * @param id the id
	 * @param time the time
	 */
	public Checklist(long id, long time) {
		super(id, time);
		checkList = new ArrayList<Todo>();
	}
	
	/**
	 * Instantiates a new checklist based on location.
	 *
	 * @param id the id
	 * @param location the location
	 */
	public Checklist(long id, ILocation location) {
		super(id, location);
		checkList = new ArrayList<Todo>();
	}	
	
	/**
	 * Instantiates a new checklist based on neither time nor location.
	 *
	 * @param id the id
	 */
	public Checklist(long id) {
		super(id);
		checkList = new ArrayList<Todo>();
	}	
	
	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public List<Todo> getList()
	{
		return checkList;
	}
}
