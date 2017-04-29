package com.learning.problems.stringbased.crackingcodinginterview;

import java.util.Arrays;

public class PermutationOfOtherString {
	
/**
 * Given two strings, write a method to decide if one is permutation of the other.
 * 
 * 
 */
	
 public String sort(String s){
	 char[] content = s.toCharArray();
	 Arrays.sort(content);
	 return new String(content);
 }
 
 
 public boolean permutation(String a, String b){
	 if(a.length()!=b.length()){
		 return false;
	 }
	 else{
		return sort(a).equals(sort(b));
	 }
 }
	
	
	
}
