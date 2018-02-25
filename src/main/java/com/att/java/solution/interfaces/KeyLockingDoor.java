package com.att.java.solution.interfaces;

public class KeyLockingDoor implements Door {
	private static final Key KEY = new Key("7654");
			
	private boolean open = false;
	private boolean locked = true;
	
	@Override
	public boolean isOpen() {
		return open;
	}

	@Override
	public boolean open() {
		boolean result = false;
		
		//Manage to open only if door is unlocked
		if (!locked) {
			result = true;
		}
		
		return result;
	}

	@Override
	public boolean close() {
		boolean result = false;
		
		//Shall return true only 
		if (open && !locked) {
			open = false;
			result = true;
		}
		return result;
	}

	@Override
	public boolean lock(Key key) {
		if (isValid(key)) {
			this.locked = true;
			return true;
		} else {
			System.out.println("Must provide a valid key!");
			return false;
		}
	}

	@Override
	public boolean unlock(Key key) {
		if (isValid(key)) {
			this.locked = false;
			return true;
		} else {
			System.out.println("Must provide a valid key!");
			return false;
		}
	}

	private boolean isValid(Key key) {
		return key.getKey().equals(KEY.getKey());
	}

	@Override
	public boolean isLocked() {
		return locked;
	}

}
