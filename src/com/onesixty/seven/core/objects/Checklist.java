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
	 * @param title the title
	 * @param time the time
	 */
	public CheckList(final long id, final String title, long time) {
		super(id, title, time);
		checkList = new ArrayList<CheckListItem>();
	}
	
	/**
	 * Instantiates a new checklist based on location.
	 *
	 * @param id the id
	 * @param title the title
	 * @param location the location
	 */
	public CheckList(final long id, final String title, ILocation location) {
		super(id, title, location);
		checkList = new ArrayList<CheckListItem>();
	}	
	
	/**
	 * Instantiates a new checklist based on neither time nor location.
	 *
	 * @param id the id
	 * @param title the title
	 */
	public CheckList(final long id, final String title) {
		super(id, title);
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
