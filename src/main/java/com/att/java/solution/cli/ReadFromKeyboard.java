package com.att.java.solution.cli;

import java.util.Random;
import java.util.Scanner;

public class ReadFromKeyboard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random(System.currentTimeMillis());
		int n1 = random.nextInt(20);
		int n2 = random.nextInt(20);
		
		System.out.println("How much is " + n1 + "+" + n2);
		int answer = scanner.nextInt();

		if (answer == (n1 + n2)) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
		}
		
		scanner.close();
	}
}
