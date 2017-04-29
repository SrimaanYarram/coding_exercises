package com.learning.yettosolve;

import java.util.ArrayList;
import java.util.HashMap;

public class StringCompressionOfRepatedCharacters {
	
	/**
	 * Implement a method to perform basic string compression using the counts of repeated characters.
	 * Example : aabcccccaa would become a2b1c5a2,
	 * Assume that the string has only upper and lower case letter (a-z)
	 */
	
	 /**
	  * 
	  *   AAAPPLBEPCAA
	  * 
	  * 
	  * @param args
	  */
	
	public static void main1(String args[]){
		
		String input ="aabcccccaa";
		String output="";
		
		int count=1;
		for(int i=1;i<input.length();i++){
			if(input.charAt(i)==input.charAt(i-1)){
					count++;
			}
			else{
				output+=input.charAt(i-1)+""+count;
				count=1;
			}
		}
		System.out.println(output+input.charAt(input.length()-1	)+""+count);
	}
	
	

	
	

}
