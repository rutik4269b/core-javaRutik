package com.ifelse;

import java.util.Scanner;

public class GraphINQuadrant {
	public static void main(String[] args) {
        int x, y;
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the Co-ordinates for the point x :");
        x = Sc.nextInt();
        System.out.println("Enter the Co-ordinates for the point y:");
        y = Sc.nextInt();

        if (x > 0 && y > 0)
                System.out.println("Point lies in First Quadrant");

        else if (x < 0 && y > 0)
                System.out.println("Point lies in Second Quadrant");

        else if (x > 0 && y > 0)
                System.out.println("Point lies in Third Quadrant");

        else if (x < 0 && y > 0)
                System.out.println("Point lies in Fourth Quadrant");

        else if (x != 0 && y == 0)
                System.out.println("Point lies on X-axis");

        else if (x == 0 && y != 0)
                System.out.println("Point lies on y-axis");

        else
                System.out.println("Point lies on Origin");

        Sc.close();


    }

}
