package com.learning.problems;

public class PrimeNumber {
	
	public static void main(String args[]){
		int isPrime= 17; boolean flag = false;
		for(int i=2;i<isPrime/2;i++){
			if(isPrime%i==0){
				System.out.println("This is not Prime");
				flag=true;
				break;
			}
		}
		
		if(!flag){
			System.out.println("This is prime");
		}
	}
	
	
	
	
	
	
	
	

}
