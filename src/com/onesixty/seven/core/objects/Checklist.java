package com.onesixty.seven.core.objects;

import java.util.ArrayList;
import java.util.List;

import com.onesixty.seven.core.intefaces.ILocation;

/**
 * The Class Checklist.
 */
public class CheckList extends Notification {
	
	/** The check list. */
	private List<CheckListItem> checkList;
	
	/**
	 * Instantiates a new checklist based on time.
	 *
	 * @param id the id
	 * @param time the time
	 */
	public CheckList(long id, long time) {
		super(id, time);
		checkList = new ArrayList<CheckListItem>();
	}
	
	/**
	 * Instantiates a new checklist based on location.
	 *
	 * @param id the id
	 * @param location the location
	 */
	public CheckList(long id, ILocation location) {
		super(id, location);
		checkList = new ArrayList<CheckListItem>();
	}	
	
	/**
	 * Instantiates a new checklist based on neither time nor location.
	 *
	 * @param id the id
	 */
	public CheckList(long id) {
		super(id);
		checkList = new ArrayList<CheckListItem>();
	}	
	
	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public List<CheckListItem> getList()
	{
		return checkList;
	}
}
