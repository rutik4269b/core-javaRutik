package com.ifelse;

import java.util.Scanner;

public class LargerNo {
	  public static void main(String[] args) {
	        int n1,n2;
	        Scanner Sc = new Scanner(System.in);
	        
	        System.out.print("Enter the First Number For Cheaking : ");
	        n1 = Sc.nextInt();
	        System.out.print("Enter the Second Number For Cheaking : ");
	        n2 = Sc.nextInt();

	        if(n1>n2)
	            System.out.println(n1 + " is largest Number" );
	        else{
	            System.out.println(  n2 + " is largest Number " );   
	        }
	        Sc.close();
	    }
	

}
