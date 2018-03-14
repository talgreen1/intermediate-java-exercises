package com.att.java.solution.interfaces;

import com.att.java.exercise.interfaces.Door;
import com.att.java.exercise.interfaces.Key;

public class NonLockingDoor implements Door {
	
	private boolean open = false;
	
	@Override
	public boolean isOpen() {
		return this.open;
	}

	@Override
	public boolean open() {
		this.open = true;
		return true;
	}

	@Override
	public boolean close() {
		this.open = false;
		return true;
	}

	@Override
	public boolean lock(Key k) {
		return true;
	}

	@Override
	public boolean unlock(Key k) {
		return true;
	}

	@Override
	public boolean isLocked() {
		return false;
	}
	
}
