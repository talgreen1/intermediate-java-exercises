package com.att.java.solution.interfaces;

public interface Door {
	boolean isOpen();
	boolean open();
	boolean close();
	boolean lock(Key k);
	boolean unlock(Key k);
	boolean isLocked();
}
