package com.learning.problems;

public class CombinationsOfString {
	
	
	public static void main(String args[]){
		
		String s ="ABCD";
		
		for(int i=0;i<=s.length();i++){
			for(int j=s.length();j>=i;--j){
				System.out.println(s.substring(i, j));
			}
		}
	}

}
