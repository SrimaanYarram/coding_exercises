package com.learning.problems.numbers;

public class ParseInt {
	
	public static void main(String args[]){
		
			char di = '5';
			int a = di-'0';
			System.out.println(a);
			String str = "451";
		    int answer = 0, factor = 1;
		    for (int i = str.length()-1; i >= 0; i--) {
		    	System.out.println(str.charAt(i) - '0');
		        answer += (str.charAt(i) - '0') * factor;
		        factor *= 10;
		        System.out.println("factor" + factor);
		    }
		    System.out.println(answer);
		}
	}


