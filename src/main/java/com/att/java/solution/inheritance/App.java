package com.att.java.solution.inheritance;

import java.awt.Color;

public class App {

	public static void main(String[] args) {
		
		//Creates a Shape Object with default color
		Shape shape = new Shape();
		System.out.println(shape);
		
		// ** Shall not compile because no default constructor exist **
		//Shape circle  = new Circle(); 
		
		//Blue circle with radius=5
		Shape circle =  new Circle(5, Color.BLUE);  
		System.out.println("circle area      = " + circle.calcArea());
		System.out.println("circle perimeter = " + circle.calcPerimeter());
		System.out.println("circle color     = " + circle.getColor());
		
	}
}
