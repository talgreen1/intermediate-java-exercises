package com.att.java.exercise.interfaces;

public class KeyLockingDoor implements Door {
	private static final Key KEY = new Key("secret");

	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean open() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lock(Key k) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unlock(Key k) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLocked() {
		// TODO Auto-generated method stub
		return false;
	}
			


}
