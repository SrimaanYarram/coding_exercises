package com.learning.problems.stringbased;

public class Anagram {
	
	public static void main(String args[]){
		System.out.println(isAnagram( "aamdm", "madam"));
	}
	
	
	/**
	 * Approach 1
	 * 
	 * Alogrithm:
	 * 
	 * 1. First try to convert the word into char array
	 * 2. Iterate the Char Array and check if that character is in Anagram
	 * 3. If Yes then remove that particular character and get the remaining characters in anagaram
	 * 4. Continue iteration Step 3 logic will keeping reducing the 
	 * 
	 * @param word
	 * @param anagram
	 * @return
	 */
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			System.out.println(c);
			int index = anagram.indexOf(c);
			System.out.println("Index -->" + index);
			
			if (index != -1) {
				System.out.println("1 -->" + anagram.substring(0, index) );
				System.out.println("2 -->" + anagram.substring(index + 1, anagram.length()));
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
				System.out.println("angram-->" + anagram);
				
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

}
