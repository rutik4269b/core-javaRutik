package com.objectANDmethod;

import java.util.Scanner;



public class TypesOfObject {
    int a;   // instance variable 
    static int b =0;  // static variable

    TypesOfObject(int i) {    // constructor obj1  integer i parameter pass to it
     
    	a =  b++;      // a value is increment 
    
    }

   
	public static void main(String[] args) {
	 System.out.print("Enter the number of objects you want to create: ");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i= 1; i<=c; i++) {
			TypesOfObject ob = new TypesOfObject(i);
			System.out.println(" obj "+ i +  " = new obj( )  ");
		}
		TypesOfObject  ob1 = new TypesOfObject(0);
		
		System.out.println(ob1.a);
		sc.close();
    }
}

