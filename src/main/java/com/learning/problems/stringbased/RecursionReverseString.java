package com.learning.problems.stringbased;

public class RecursionReverseString {
	
	public static void main(String args[]){
		System.out.println(reverse("Srimaan"));
	}
	
	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    System.out.println(str.substring(1));
	    System.out.println(str.charAt(0));
	    return reverse(str.substring(1)) + str.charAt(0);
	}

}
