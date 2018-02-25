package com.att.java.solution.abstractclass;

import java.awt.Color;

public abstract class Shape {
	
	private static final Color DEFAULT_COLOR = Color.BLACK;
	
	protected Color color;
	
	public Shape() {
		this.color = DEFAULT_COLOR;
	}
	
	public Shape(Color c) {
		this.color = c;
	}
	
	/**
	 * Should calculate and return this shape's perimeter
	 * 
	 * @return double
	 */
	public abstract double calcPerimeter();
	
	/**
	 * Should calculate and return this shape's area
	 * 
	 * @return double
	 */
	public abstract double calcArea();
	
	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Im an unknown shape with color " + color;
	}
	
	public abstract void draw();
}
