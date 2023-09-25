package com.forLoop;

import java.util.Scanner;

public class TableNoFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number of that table : ");
		int no = sc.nextInt(); 
		int table= 0;
		
		System.out.print(" Table of " +  no +  " is  :-" );
		for (int i = 1 ; i<=10 ; i++) {
			table = no * i;
			  System.out.print( " " + table);
			 
		}
       sc.close();
	}

}
