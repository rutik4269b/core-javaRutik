package com.ifelse;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number");
		int num3 = sc.nextInt();

		int gnumber = num1;

		if (num2 > gnumber) {
			gnumber = num2;
		}

		if (num3 > gnumber) {
			gnumber = num3;
		}

		System.out.println("The greatest number is: " + gnumber);
		sc.close();
	}

}
