package com.switchCase;

import java.util.Scanner;

public class Week {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Generate a random integer between 1 and 7
      //  int random = (int) (Math.random() * 7) + 1;

        // Calculate the weekday name based on the generated random number
        String weekday = "";
        switch (number) {
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 7:
                weekday = "Saturday";
                break;
        }

        System.out.println("day in weekday is : " + weekday);
        scanner.close();
    }
}


