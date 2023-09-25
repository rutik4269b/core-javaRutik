package com.forLoop;

import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number For Countdown : ");
		count = sc.nextInt();
		for (int t = count; t >= 1; t--) {
			System.out.print(" " + t);
		}
		sc.close();
	}

}
