package com.java;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		 {
		        int number, n, sum = 0;
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number:");
		        number = sc.nextInt();
		        while(number > 0)
		        {
		            n = number % 10;
		            sum = sum * 10 + n;
		            number = number / 10;
		        }
		        System.out.println("Reverse of a Number is "+sum);
		    }
		}

	}


