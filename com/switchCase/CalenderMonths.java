package com.switchCase;

import java.util.Scanner;

public class CalenderMonths {
	
	 public static void main(String[] args) {
	        int m;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the month no in the Calender(1-12) : ");
	        m = sc.nextInt();
	        if (m > 12 || m < 0) {
	            System.out.println("Invalid Input Please enter valid Month Number");
	        } else {
	            switch (m) {
	                case 1:
	                    System.out.println(" Your Month is January ");
	                    break;
	                case 2:
	                    System.out.println(" Your Month is February ");
	                    break;
	                case 3:
	                    System.out.println(" Your Month is March ");
	                    break;
	                case 4:
	                    System.out.println(" Your Month is April ");
	                    break;
	                case 5:
	                    System.out.println(" Your Month is May ");
	                    break;
	                case 6:
	                    System.out.println(" Your Month is June ");
	                    break;
	                case 7:
	                    System.out.println(" Your Month is July ");
	                    break;
	                case 8:
	                    System.out.println(" Your Month is August ");
	                    break;
	                case 9:
	                    System.out.println(" Your Month is September ");
	                    break;
	                case 10:
	                    System.out.println(" Your Month is Octomber ");
	                    break;
	                case 11:
	                    System.out.println(" Your Month is November ");
	                    break;
	                case 12:
	                    System.out.println(" Your Month is December ");
	                    break;
	                default:
	                    System.out.println("Invalid Month");
	                    break;
	                
	            }
	            
	        }
	        
	      sc.close();  
	    }

	}



