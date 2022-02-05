package com.company;
import java.util.Scanner;
import java.lang.Math.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kilograms: ");
        double kiloWeight = input.nextDouble();
        int poundWeight = (int) (kiloWeight/0.45359237);
        double ounceWeight = Math.round((kiloWeight%0.45359237)/0.028349523125*10);
        ounceWeight = ounceWeight/10;
        System.out.printf("Equivalent imperial weight is " + poundWeight + " lb " + ounceWeight + " oz");
    }
}
