// Code to Calculate Compound Interest

import java.util.Scanner;

public class firstProject {
    public static void main(String[] args) {
        System.out.println("Simple Java Program to Calculate Compound Interest");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle :");
        Float P = sc.nextFloat();
        System.out.println("Enter Rate of Interest :");
        Float R = sc.nextFloat();
        System.out.println("Enter Time Period:");
        Integer T = sc.nextInt();

        Float B1 = ( 1 + (R/100));
        Double B2 = Math.pow( B1 , T);
        Double A = P * B2;

        System.out.println("Principle :" +P);
        System.out.println(" Rate Of Interest :" + R);
        System.out.println("Time Period :" + T );
        System.out.println("Calculated Amount :" + A);
        Double CI = A - P;
        System.out.println(" Calculated Interest :" + CI);


    }
}

