package com.java;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		{
	        int number, a = 0, b = 0, c = 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        number = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= number; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
	    }
	}

	}

