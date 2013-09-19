package com.onesixty.seven.platform.commandline;

import com.onesixty.seven.core.intefaces.IPlatform;
import com.onesixty.seven.core.intefaces.IStorage;

public class Platform implements IPlatform{

	IStorage storage;
	
	public void Platform() {
		this.storage = new StorageModel();
	}
	
	@Override
	public void registerForAlarm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deregisterForAlarm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IStorage getPlatformStorage() {
		return storage;
	}

}
