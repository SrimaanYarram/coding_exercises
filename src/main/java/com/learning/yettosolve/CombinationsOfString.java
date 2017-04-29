package com.learning.yettosolve;

public class CombinationsOfString {
	
	//Need to work this is not correct implementaiton
	
	public static void main(String args[]){
		
		String s ="ABCD";
		
		for(int i=0;i<=s.length();i++){
			for(int j=s.length();j>=i;--j){
				System.out.println(s.substring(i, j));
			}
		}
	}

}
