package com.doWhile;

public class PrintAtoZ {
	public static void main(String[] args) {

		char ch = 'A';
		do {
			System.out.print(ch + "  ");
			ch++;
		} while (ch <= 'Z');
	}
}
