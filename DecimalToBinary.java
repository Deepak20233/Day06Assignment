package com.java;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to find the Binary :");
        int number= s.nextInt();
        long binary=0;
        long placeValue = 1;
        while(number!=0)
        {
            int rem = number%2;
            binary = binary+rem* placeValue;
            number=number/2;
            placeValue*=10;
        }

        System.out.println(binary);
    }
}
