package com.att.java.solution.abstractclass;

import java.awt.Color;

public class App {

	public static void main(String[] args) {
		
		//Exercise 1:
		//===========
		//** The following statement does not compile. Why? ** 
		//Shape shape = new Shape();
		
		//Exercise 2:
		//===========		
		System.out.println("--- Exercise 2: ---");
		
		//Create Blue circle with radius=5 and print its perimeter, area and color
		Shape circle = new Circle(5, Color.BLUE);
		printShape(circle);		
		
		//Exercise 3:
		//===========
		System.out.println("--- Exercise 3: ---");
		
		//Create RED rectangle with height=3 width=4 and print its area, perimeter and color
		Shape rect =  new Rectangle(3, 4, Color.RED);
		printShape(rect);
		
		//Exercise 4:
		//===========
		System.out.println("--- Exercise 4: ---");
		
		//Create a square with edge=9 and default color and print its details
		Shape square =  new Square(9);
		printShape(square);
		
		
		//Exercise 5:
		//===========
		System.out.println("--- Exercise 5: ---");
		
		//Is square a rectangle? Is rectangle a square? Write a suitable statement. 
		System.out.println("Is square a rectangle ? " + (square instanceof Rectangle));
		System.out.println("Is rectangle a square ? " + (rect instanceof Square));

		//Exercise 6:
		//===========
		System.out.println("--- Exercise 6: ---");

		//** The following statement does not compile. Why? **
		//double diagonal = rect.calcDiagonal();
		

		//Exercise 7:
		//===========
		System.out.println("--- Exercise 7: ---");
		
		//Downcast Shape to Rectangle and make the previous statement compile and print result.
		Rectangle rectangle = (Rectangle)rect;
		double diagonal = rectangle.calcDiagonal();
		System.out.println("rectangle diagonal     = " + diagonal);
		
		//Exercise 8:
		//===========
		System.out.println("--- Exercise 8: ---");
		
		//Create some shape, if it is a rectangle (or square) print its diagonal
		Shape shape = createShape(); 			 //A Shape object unknown in compile time
		
		if (shape instanceof Rectangle) {   		 //Determine Shape concrete type in RT
			Square square2 = (Square)shape;		 //Down Casting the Shape to Square
			double diag = square2.calcDiagonal(); //Safely invoking Square actions
			System.out.println("Diagonal="+diag);
		}
		
	}

	private static Shape createShape() {
		return new Square(5);
	}
	
	private static void printShape(Shape s) {
		System.out.println("Area      = " + s.calcArea());
		System.out.println("Perimeter = " + s.calcPerimeter());
		System.out.println("Color     = " + s.getColor());		
	}
	
}
