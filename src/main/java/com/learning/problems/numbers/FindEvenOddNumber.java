package com.learning.problems.numbers;

public class FindEvenOddNumber {
	
	public static void main(String args[]){
		
		
		FindEvenOddNumber and = new FindEvenOddNumber();
		
		long start = System.nanoTime();
		
		System.out.println(and.andOperatorApproach(16));
		
		System.out.println(System.nanoTime() - start);
		
		System.out.println(and.modulsOperatorApproach(16));
		
		long start2 = System.nanoTime();
		
		System.out.println(System.nanoTime() - start2);
		
		
		
	}
	
	
	public boolean modulsOperatorApproach(int number){
		if(number%2==0) {
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	public boolean andOperatorApproach(int number){
		if((number & 1 ) == 0) return true;
		else return false;
		}
	
}
