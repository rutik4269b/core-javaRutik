package com.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	  public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the Number For Cheaking : ");
	        int number = sc.nextInt();
	        if(number>0){
	            System.out.println("Number is Positive");
	        }
	        else if(number<0){
	            System.out.println("Number Is Negative");
	        }
	        else{
	            System.out.println("Number is Zero");
	        }
	        sc.close();
	    }
	
	
}
