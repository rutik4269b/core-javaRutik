package com.ifelse;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        System.out.println("-------- *Result*----------");

        System.out.print("Enter your DL Marks : ");
        int DL = scan.nextInt();
        if(DL>100 || DL < 0) {
            System.out.println(" Please enter a valid marks of DL "+ DL);
            System.out.print("Enter your DL Marks : ");
             DL = scan.nextInt();
        }

        System.out.print("Enter your HPC Marks : ");
        int HPC = scan.nextInt();
        if(HPC>100 || HPC < 0) {
        System.out.println(" Please enter a valid marks of HPC "+ HPC);
        System.out.print("Enter your HPC Marks : ");
        HPC = scan.nextInt();
        }
       

        System.out.print("Enter your SDN Marks : ");
        int SDN = scan.nextInt();
        if(SDN>100 || SDN < 0) {
        System.out.println(" Please entered a valid marks of SDN "+ SDN);
        System.out.print("Enter your SDN Marks : ");
        SDN = scan.nextInt();
        }
       
                
       

        System.out.print("Enter your BI Marks : ");
        int BI = scan.nextInt();
        if(BI>100 || BI < 0) {
        System.out.print(" Please entered a Valid Marks of BI "+ BI);
        System.out.print("Enter your BI Marks : ");
        BI = scan.nextInt();
        }
       
                
        

        System.out.print("Enter your Project Marks : ");
        int Project = scan.nextInt();
        if(Project>100 || Project < 0) {
        System.out.println(" please entered a Valid Marks of Project "+ Project);
        System.out.print("Enter your Project Marks : ");
        Project = scan.nextInt();
        }
                
       
        Float Percentage = ((DL + HPC + SDN + BI + Project)/500.0f)*100;
        System.out.print("Percentage : ");
        System.out.print(Percentage);
        scan.close();
        
    }

}
