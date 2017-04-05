package com.learning.problems.numbers;

import org.testng.annotations.Test;

public class FibonacciSeries {
	
	


	/**
	 * 
	 *  Java Notes = Recursion is slower compared with Iteration or through loops
	 *  The below example using tail recursion
	 *  
	 * 
	 */
	
	
	@Test
	public void usingRecursion() {
		long startTime = System.nanoTime();
		for(int i =1;i<=15; i++){
			fibonacciRecursion(i);
			System.out.println("loop =" +i);
		}
		long end = System.nanoTime();
		
		long nonRecursion=end-startTime;
		
		System.out.println(nonRecursion);
	}
	

	@Test
	public void nonRecursion() {
		long startTime = System.nanoTime();
		
		fibonacciSeries(15);
		long end = System.nanoTime();
		
		long recursion=end-startTime;
		
		System.out.println(recursion);
	}
	
	
	
	public  void fibonacciSeries(int upto){
		int fibo1=0, fibo2=1, fibo3=1;
		for(int i=0;i<=upto;i++){
			fibo3 = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
	        fibo1 = fibo2;
	        fibo2 = fibo3;
			System.out.println(fibo3);
	}
	}
		
		
	public  int fibonacciRecursion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        
        System.out.println(number);
 
        return fibonacciRecursion(number-1) + fibonacciRecursion(number -2); //tail recursion
    }


}
