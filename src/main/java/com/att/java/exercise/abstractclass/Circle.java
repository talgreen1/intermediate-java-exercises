package com.att.java.exercise.abstractclass;

import java.awt.Color;

/**
 * Concrete Shape that represents a Circle
 * 
 */
public class Circle extends Shape {

	protected double radius;

	/**
	 * Constructor with default color (calling default parent constructor)
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calcPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return String.format("Circle : { radius : %f, color : %s }", radius, color.toString());
	}

}
