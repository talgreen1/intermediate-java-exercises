package com.att.java.solution.abstractclass;

import java.awt.Color;

/**
 * Concrete Shape that represents a Circle
 * 
 */
public class Circle extends Shape {
	
	protected double radius;
	
	/**
	 * Constructor with default color (calling default parent constructor)
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, Color color) {
		this.radius = radius;
		this.color = color;
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
		return String.format("Circle : { radius : %d, color : %s }", radius, color);
	}

	@Override
	public void draw() {
		System.out.println("  ******  ");
		System.out.println(" ******** ");
		System.out.println("**********");
		System.out.println(" ******** ");
		System.out.println("  ******  ");
	}
	
}
