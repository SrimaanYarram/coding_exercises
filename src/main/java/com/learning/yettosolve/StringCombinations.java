package com.learning.yettosolve;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StringCombinations {
	
	public static void main(String args[]){
		
			
			String s2 = "ebay";
			System.out.println("\nString " + s2 + ":\nPermutations: " + crunchifyPermutation(s2));
			
			
		}
	
	
	    public static ArrayList<String> findPermutations(ArrayList<String> letterArray) {
	        ArrayList<String> result = new ArrayList<String>();
	        for (int i = 0; i < letterArray.size(); i++) {
	            String current = letterArray.get(i);
	            for (int j = i +1; j < letterArray.size(); j++) {
	                current = current + letterArray.get(j); 
	            }
	            result.add(current);

	        }
	        return result;
	    }
	
	 
		public static Set<String> crunchifyPermutation(String str) {
			Set<String> crunchifyResult = new HashSet<String>();
			if (str == null) {
				return null;
			} else if (str.length() == 0) {
				crunchifyResult.add("");
				return crunchifyResult;
			}
	 
			char firstChar = str.charAt(0);
			String rem = str.substring(1);
			ArrayList<String> a = new ArrayList<String>();
			a.add(rem);
			Set<String> words = crunchifyPermutation(rem);
			for (String newString : words) {
				for (int i = 0; i <= newString.length(); i++) {
					crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
				}
			}
			return crunchifyResult;
		}
	 
		public static String crunchifyCharAdd(String str, char c, int j) {
			String first = str.substring(0, j);
			String last = str.substring(j);
			return first + c + last;
		}
		
		


}
