package com.java;

import java.util.Scanner;

public class temperaturConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double n; 
        System.out.println("Enter the temperature in fahrenheit :");
        //System.out.println("Enter the temperature in Celsius :");
        n=sc.nextInt(); 
        double  Celsius;
        Celsius = ((n-32)*5)/9;
        System.out.println("Temperature in celsius is: "+ Celsius);
	}

}
