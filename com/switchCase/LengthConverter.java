package com.switchCase;

import java.util.Scanner;

public class LengthConverter {
	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        String Option = " ";

	        do {
	            
	            System.out.println("*---------------- Length Converter-----------------*");
	            System.out.println("Choose the input unit:");
	            System.out.println("1. Kilometers");
	            System.out.println("2. Meters");
	            System.out.println("3. Centimeters");
	            System.out.println("4. Millimeters");
	            System.out.print("Enter your choice (1/2/3/4): ");
	            

	            int choice = input.nextInt();
	            System.out.println();
	            double length = 0.0;

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter length in Kilometers: ");
	                    length = input.nextDouble();
	                    break;
	                case 2:
	                    System.out.print("Enter length in Meters: ");
	                    length = input.nextDouble() / 1000;
	                    break;
	                case 3:
	                    System.out.print("Enter length in Centimeters: ");
	                    length = input.nextDouble() / 100_000;
	                    break;
	                case 4:
	                    System.out.print("Enter length in Millimeters: ");
	                    length = input.nextDouble() / 1_000_000;
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	                    input.close();
	                    break;
	            }

	            double totalMillimeters = length * 1_000_000;
	            double totalMeters = length * 1_000;
	            double totalKilometers = length;

	            System.out.println(" * Total Length in Kilometers: " + totalKilometers + " km");
	            System.out.println(" * Total Length in Meters: " + totalMeters + " m");
	            System.out.println(" * Total Length in Centimeters: " + (totalMillimeters / 10) + " cm");
	            System.out.println(" * Total Length in Millimeters: " + totalMillimeters + " mm");

	            System.out.print("Do you want to continue with another conversion? (yes/no) : ");
	            Option = input.next();

	            if (!Option.equalsIgnoreCase("yes")) {
	                System.out.println("Goodbye! Thanks for using Length Converter");
	                break;
	            }

	        } while (Option.equals("yes"));
	        input.close();
	    }
	}


