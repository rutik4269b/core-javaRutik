package com.forLoop;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		String reverseString = " ";
		System.out.print("Enter the name you want reverse : ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		for (int i = word.length() - 1; i >= 0; i--) {
			char reverse = word.charAt(i);
			reverseString = reverseString + reverse;
		}
		System.out.println("Reversed String of that name is : " + reverseString);
		sc.close();
	}

}
