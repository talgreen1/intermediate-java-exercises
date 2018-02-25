package com.att.java.exercise.abstractclass;

public class App {

	/*
	 * 
	 * 1. Convert Shape class to Abstract class and its relevant methods.
	   2. Implement a Rectangle Class that extends Shape and implements:
          - Abstract Shape methods (calcPerimeter, calcArea)
          - Add an calcDiagonal method that calculates the Rectangle’s diagonal length
       3. Implement a Square Class
	 */
	public static void main(String[] args) {
		
		//Exercise 1:
		//===========
		//** The following statement does not compile. Why? ** 
		//Shape shape = new Shape();
		
		//Exercise 2:
		//===========		
		System.out.println("--- Exercise 2: ---");
		
		//Create Blue circle with radius=5 and print its perimeter, area and color
		
		//Exercise 3:
		//===========
		System.out.println("--- Exercise 3: ---");
		
		//Create RED rectangle with height=3 width=4 and print its area, perimeter and color
		
		//Exercise 4:
		//===========
		System.out.println("--- Exercise 4: ---");
		
		//Create a square with edge=9 and default color and print its details
		
		//Exercise 5:
		//===========
		System.out.println("--- Exercise 5: ---");
		
		//Is square a rectangle? Is rectangle a square? Write a suitable statement. 

		//Exercise 6:
		//===========
		System.out.println("--- Exercise 6: ---");

		//** The following statement does not compile. Why? **
		//double diagonal = rect.calcDiagonal();
		

		//Exercise 7:
		//===========
		System.out.println("--- Exercise 7: ---");
		
		//Downcast Shape to Rectangle and make the previous statement compile and print result.
		
		//Exercise 8:
		//===========
		System.out.println("--- Exercise 8: ---");
		
		//Create some shape, if it is a rectangle (or square) print its diagonal
		
	}

	/**
	 * Utility Method to create some shape
	 * 
	 * @return Shape
	 */
	private static Shape createShape() {
		return null;
	}
	
	/**
	 * Utility method to print a shape
	 * 
	 * @param Shape
	 */
	private static void printShape(Shape s) {
	}
	
}