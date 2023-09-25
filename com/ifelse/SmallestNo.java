package com.ifelse;

import java.util.Scanner;

public class SmallestNo {
	  public static void main(String[] args) {
		    Scanner Sc = new Scanner(System.in);
	        System.out.print("Enter the First Number: ");
	        int  a = Sc.nextInt();
	        	       
	        System.out.print("Enter the Second Number: ");
	         int  b = Sc.nextInt();
	         
	         System.out.print("Enter the Third  Number: "); 
	         int c = Sc.nextInt();
	         System.out.println();

	        if(a<b){
	            if(a<c)
	            System.out.println( a + "  is the Smallest Number " );
	            else
	            System.out.println( c + " is the Smallest Number " );
	        } else{
	            if(b<c)
	            System.out.println( b +  " is the Smallest Number " );
	            else
	            System.out.println(  c + " is the Smallest Number " );
	        }
	        Sc.close();

}
}
