package com.att.java.solution.abstractclass;

import java.awt.Color;

public class Rectangle extends Shape {
	
	protected double height = 0;
	protected double width = 0;
	
	/**
	 * Constructor with default color
	 * 
	 * @param height
	 * @param width
	 */
	public Rectangle(double h, double w) {
		super();
		this.height = h;
		this.width = w;
	}
	
	/**
	 * Overloaded Constructor with given color
	 * 
	 * @param height
	 * @param width
	 */
	public Rectangle(double height, double width, Color color) {
		super(color);
		this.height = height;
		this.width = width;
	}


	@Override
	public double calcArea() {
		return height * width;
	}
	
	@Override
	public double calcPerimeter() {
		return 2 * height + 2 * width;
	}
	
	public double calcDiagonal() {
		return Math.sqrt(height*height + width*width);
	}

	@Override
	public void draw() {
		System.out.println("*********");
		System.out.println("*********");
		System.out.println("*********");
	}
	
}
