package com.doWhile;

import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the last number till want countdown : ");
		int num = sc.nextInt();
		do {
			System.out.println("Count : " + count);
			count++;
		} while (count <= num);
		sc.close();

	}

}
