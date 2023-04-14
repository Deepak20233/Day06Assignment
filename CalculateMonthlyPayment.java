package com.java;

import java.io.InputStreamReader;
import java.util.Scanner;
	

public class CalculateMonthlyPayment {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(new InputStreamReader(System.in));
				System.out.println("Enter years to pay off(Y): "); 
				int Y = scanner.nextInt();
				System.out.println("Enter principal loan amount(P): ");
				double P = scanner.nextInt();
				System.out.println("Enter percentage interest(R): ");
				double R = scanner.nextInt();
				//print input values
				int n = 12*Y;
				double r = R/1200;
				double payment = P*r/(1-Math.pow((1+r),(-n)));
			    System.out.println("Final payment is : "+ payment);
	}
}
