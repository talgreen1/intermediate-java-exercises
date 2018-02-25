package com.att.java.solution.abstractclass;

import java.awt.Color;

public class Square extends Rectangle {
	
	public Square(double edge) {
		super(edge, edge);
	}
	
	public Square(double edge, Color color) {
		super(edge, edge, color);
	}

}
