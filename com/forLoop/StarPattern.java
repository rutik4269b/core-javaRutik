package com.forLoop;

public class StarPattern {

	public static void main(String[] args) {

		int row, column;

		// for print Star pattern
		for (row = 0; row < 10; row++) {
			for (column = 1; column <= row; column++) {
				System.out.print("*");
				column++;
			}
			System.out.println("*");
			row++;

		}

	}
}
