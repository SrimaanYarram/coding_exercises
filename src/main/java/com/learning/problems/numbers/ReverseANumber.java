package com.learning.problems.numbers;

public class ReverseANumber {
	

	 
	   public static void main(String args[])
	   {
	      int n, reverse = 0;
	 
	      System.out.println("Enter the number to reverse");
	 
	      n = 124;
	 
	      while( n != 0 ){
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);
	   
	}

}
