package com.ifelse;

import java.util.Scanner;

public class OddandEven {
	public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for check odd and even:");
        num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Number is Even: ");
        else
            System.out.println("Number is odd");
      sc.close();
    }
	
}
