package com.ifelse;

import java.util.Scanner;

public class Result2 {
	 public static void main(String[] args) {
	        Scanner T = new Scanner(System.in);
	        int Total = 0;
	        String[] subjects = { "Dl", "HPC", "SDN", "BI", "Project" };
	        System.out.println("Enter your Subject Marks");
	        for (String subject : subjects) {
	            System.out.print("Enter your " + subject + " Marks : ");
	            int marks = T.nextInt();
	            if (marks < 100 && marks >= 0) {
	                Total += marks; // Total=Total+Marks

	            } else {
	                System.out.println("Please enter valid input");
	                System.out.print("Enter your " + subject + " Marks : ");
	                marks = T.nextInt();
	                if (marks < 100 && marks >= 0) {
	                    Total += marks; // Total=Total+Marks
	                } else {
	                    break;
	                }

	            }
	        }
	        Float avg = Total / (subjects.length * 100.0f) * 100;
	        System.out.println("your Percentage is " + avg);
	        if (avg >= 40) {
	            System.out.println("You are Pass");
	        } else {
	            System.out.println("You are Fail");
	        }
	        T.close();
	    }

}
