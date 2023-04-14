package com.java;

import java.util.Scanner;

public class SqareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double number; 
        System.out.println("Enter number to find the sqrt :");
        number = sc.nextInt();
        SqareRoot obj = new SqareRoot();
        if(number > 0) {
        sqrt(number);
        //double n = Math.sqrt(number);
        //System.out.println("Sqrt  : "+n);
        }
	}
	
	static void sqrt(double c)
    { 
		    double epsilon = 1e-15;    
	        double t = c;              
	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }
	        System.out.println("Sqrt of given number is : "+t);
    }
}
