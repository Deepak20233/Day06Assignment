package com.java;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		{
		      int number, i, count=0;
		      Scanner s = new Scanner(System.in);
		      
		      System.out.print("Enter a Number: ");
		      number = s.nextInt();
		      
		      for(i=2; i<number; i++)
		      {
		         if(number%i == 0)
		         {
		            count++;
		            break;
		         }
		      }
		      
		      if(count==0)
		         System.out.println("It is a Prime Number.");
		      else
		         System.out.println("It is not a Prime Number.");
		   }
		}

	}

