package com.learning.problems.stringbased.crackingcodinginterview;

import org.testng.annotations.Test;


/**
 * Cracking The Coding Interview
 * Chapter 1 | Array and Strings
 *
 * Problem:
 * Implement an alogrithm to determine if a string has all unique characters. What if you cannot use additional data structures
 * 
 * Solution : pg 172
 * Problem Approach : Check whether the String is ASCII String or a Unicode String.
 *                    If the String is Unicode then we need to increase the Array Size (Char or boolean) logic will be same. 
 * @author syarram
 *
 */



public class DuplicateCharactersInString {
	
	
	
	
		
	

	/**
	 * Time Complexity is O(n2) : 5.32Ms
	 */
	@Test
	public void duplicateUsing2ForLoops(){
		String s = "duplicateuduplicateuduplicateuduplicateuduplicateuduplicateuduplicateuduplicateu";
		for(int i=0;i<s.length();i++){
			for(int j=1;j<s.length();j++){
			if(s.charAt(i) == s.charAt(j)){
				System.out.println("Hee... We found the...Stuff");
				System.out.println("we found innerr -- " + s.charAt(i) + "---" + s.charAt(j));
				break;
			}	
			
			}
		}
	}
	
	
	/** 
	 * Srimaan own Implementation using char
	 */
	@Test
	public void duplicateUsingChar() {
		String s = "duplicateuduplicateuduplicateuduplicateuduplicateuduplicateuduplicateuduplicateu";
		if(s.length()>128){
			System.out.println("String is bigger");
		}
		char[] unique = new char[256];
		for (int i = 0; i < s.length(); i++) {
			int k = s.charAt(i);
			if (unique[k]!= '$') {
				unique[k] = '$';
				System.out.println("Pushed into...." + unique[k] + " ===> " + k);
			} else {
				System.out.println("Heeeee..........Duplicate......Found...........We Won't Proceed");
			}
		}
	}
	
	
	
	/** 
	 * Srimaan own Implementation using boolean O(n) and space complexity O(1)
	 */
	@Test
	public void duplicateUsingBoolean() {
		String s = "duplicateuduplicateuduplicateuduplicateuduplicateuduplicateuduplicateuduplicateu";
		if(s.length()>128){
			System.out.println("String is bigger");
		}
		boolean[] unique = new boolean[256];
		for (int i = 0; i < s.length(); i++) {
			int k = s.charAt(i);
			if (unique[k]!=true) {
				unique[k] = true;
				System.out.println("Pushed into...." + unique[k] + " ===> " + k);
			} else {
				System.out.println("Heeeee..........Duplicate......Found...........We Won't Proceed");
			}		
		}
	}
	
	
	/**
	 *  Space can be reduced using factor of eight by using a bit vector.
	 *  We will assume, that in the below code that the string only uses the lower cases letter a through z.
	 */
	@Test
	public void duplicateUsingVector(){
		int checker = 0;
		String s = "duplicate";
		for(int i=0;i<s.length();i++){
			int val = s.charAt(i) -'a';
			if((checker & (1 << val)) > 0){
				System.out.println("Heeeee..........Duplicate......Found...........We Won't Proceed");
			}
			checker |= (1 << val);
		}
	}
	
}
