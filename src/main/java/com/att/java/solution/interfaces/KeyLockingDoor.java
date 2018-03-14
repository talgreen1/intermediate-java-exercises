package com.att.java.solution.interfaces;

import com.att.java.exercise.interfaces.Door;
import com.att.java.exercise.interfaces.Key;

public class KeyLockingDoor implements Door {
	private static final Key KEY = new Key("secret");
			
	private boolean open = false;
	private boolean locked = true;
	
	@Override
	public boolean isOpen() {
		return open;
	}

	@Override
	public boolean open() {
		//Manage to open only if door is unlocked
		if (!locked) {
			open = true;
		}
		return open;
	}

	@Override
	public boolean close() {
		open = false;
		return !open;
	}

	@Override
	public boolean lock(Key key) {
		if (open) {
			System.out.println("Must close door first!");
			return false;
		}
		
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
		if (open || !locked) {
			return true;			
		}
		
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
