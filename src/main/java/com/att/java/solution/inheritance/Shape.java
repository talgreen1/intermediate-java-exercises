package com.att.java.solution.inheritance;

import java.awt.Color;

public class Shape {

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
	public double calcPerimeter() {
		// Unknown Shape
		return -1;
	}

	/**
	 * Should calculate and return this shape's area
	 * 
	 * @return double
	 */
	public double calcArea() {
		// Unknown Shape
		return -1;
	}

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

}
