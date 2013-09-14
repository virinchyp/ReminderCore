package com.onesixty.seven.core.objects;

/**
 * The Class Todo. It is unit of <code>Checklist</code> notification.
 */
class CheckListItem {
	
	/** The text of a todo. */
	private String text;
	
	/** The flag. */
	private boolean checked;
	
	/**
	 * The constructor.
	 *
	 * @param text the text
	 */
	public CheckListItem(String text){
		this.text = text;
		this.checked = false;
	}

	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Checks if is checked.
	 *
	 * @return true, if is checked
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * Sets the checked.
	 *
	 * @param checked the new checked
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}		
}