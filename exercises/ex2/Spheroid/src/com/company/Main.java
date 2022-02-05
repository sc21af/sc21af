package com.company;

import java.util.Scanner;
import static java.lang.Math.sqrt;//idk if these are even needed as java.lang.Math.* already seems to be here


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter equatorial radius in km: ");//yayaya double as needed
        double eqRadius = input.nextDouble();
        System.out.println("Enter polar radius in km: ");
        double poRadius = input.nextDouble();


        double eccentricity = Math.round(sqrt(1-(poRadius*poRadius)/(eqRadius*eqRadius))*1000); //*1000 /1000 to give the appropriate number of decimal places
        eccentricity = eccentricity/1000; //cant do this all on one line for some reason

        double volume = (Math.PI * 4 * eqRadius * eqRadius * poRadius) / 3; //Math.PI gives value of pi, no need to do anything else with it


        System.out.printf("Eccentricity =  " + eccentricity );
        System.out.printf("\nVolume = %7.6g cubic km",volume); //7 is number of characters (including before the decimal point and the point itself, 6 for the number of values after the decimal point
        //formatted this was as the %...g converts whatever is after the end of the ""
    }
}
