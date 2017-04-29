package com.learning.problems.stringbased;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ReverseAString {

	@Test
	public void testCharacterSwap() {
		ReverseAString r = new ReverseAString();
		String actual = "Srimaan Hello World";
		String reversed = r.characterSwap(actual);
		String expected = r.characterSwap(reversed);
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * 
	 * Solution 1 : Using Character Array and then swap values front and backward
	 * Time complexity : 
	 * 
	 * Iteration will be n/2 reason is we are moving a pointer forward and backward and then swapping the forward value with backward values using temp variable
	 * Once both forward and backward meets then the iteration will be stopped.
	 * 
	 * We can String instead of character array but each time when we swap the values then it will be new String to avoid this we used Character Array
	 * @param actual
	 * @return
	 */
	
	public String characterSwap(String actual) {
		char[] chars = actual.toCharArray();
		char swapper = ' ';
		int front = 0, rear = actual.length() - 1;
		while (front != rear) {
			swapper = chars[front];
			chars[front] = chars[rear];
			chars[rear] = swapper;
			front++;
			rear--;
		}
		return new String(chars);
	}
	
	
	/**
	 * Solution 2 : Using the String appraoch where you will read the data from the backwards then append in a new string.
	 * 
	 */
	
	public String reverseApproach(String actual){	
		String reverse ="";
		for(int i = actual.length()-1; i>=0; i--){
			reverse+= actual.charAt(i);		
		}
		return reverse;
	}
	
	
	@Test
	public void testReverseApproach() {
		ReverseAString r = new ReverseAString();
		String actual = "Srimaan Hello World";
		String reversed = r.reverseApproach(actual);
		String expected = r.reverseApproach(reversed);
		Assert.assertEquals(expected, actual);
	}
	
	
	/**
	 * Solution : Using recursion
	 * ****Understand bit more******
	 */

	public String recursion(String actual){
   	    if ((actual==null)||(actual.length() <= 1) )
		 return actual;
		 return recursion(actual.substring(1)) + actual.charAt(0);
	}
	
	
	@Test
	public void testRecursion(){
		ReverseAString r = new ReverseAString();
		String actual = "Srimaan Hello World";
		String reversed = r.recursion(actual);
		String expected = r.recursion(reversed);
		Assert.assertEquals(expected, actual);
	}
}
