package com.learning.problems.stringbased.crackingcodinginterview;

public class ReplaceSpaceWithChar {
	
	/**
	 * write a method to replace all space in a string with %20. Assume that the string has sufficient
	 * space at the end of the string to hold the additional characters.
	 * Input "Mr John Smith ", 13
	 * Output "Mr%20John%20Smith"
	 */
	
	/**
	 * Explanation : A common approach in string manipulation problems is to edit the string starting from the end and work backwards.
	 * 				 This is useful because we have extra buffer at the end, which allows us to change characters without worrying about what we're overwriting.
	 * 				 
	 * 				We will use this approach in this problem.  The algorithm works through a two scan approach. In the first scan, we count how man spaces there are in String
	 * 				This is used to compute how long the final string which will be used in the second pass which is done in reverse order.
	 * Solution : 
	 * 
	 * Solutions not work thorws ArrayIndexOutBoundException.
	 * @param cha
	 * @param length
	 */
	
	public char[] replaceChar(char[] cha, int length){
		int spaceCount=0, newLength, i;
		for(i=0;i<length;i++){
			if(cha[i]==' '){
				spaceCount++;    //Trying to calculate the number of spaces in the array.				
			}
		}
	
		newLength = length + (spaceCount * 2); //Once we found the number of white space in the array we are trying to increase it to double due to %20,
											   // Actually we need 3 character, Since the space is already count we dont need to count that so doubling will solve
		cha[newLength] = '\0';
		
		for(i= length-1;i>=0;i--){
			if(cha[i]==' '){
				cha[newLength-1] = '0';
				cha[newLength-2] = '2';
				cha[newLength-3] = '%';
			}
			else{
				cha[newLength-1] =cha[i];
				newLength = newLength -1;
			}
		}
		
		return cha;
	}
	
	
	
	
	public static void main(String args[]) {
		
		String s = "Mr John Smith           ";
		
		ReplaceSpaceWithChar rep = new ReplaceSpaceWithChar();
		System.out.println(rep.replaceChar(s.toCharArray(), s.length()));
	}
	
	
	/**
	 * Simple and Quick Approach by Srimaan, but space complexity increase as the String size increase say if the string size is 10 (lenght()) then 10*8 
	 * Since the String is immutable
	 */
	
	
	public void spaceComplexity(){
		String input = "Mr John Smith     5";
		String output="";
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				output+="%20";
			}
			else{
				output+=input.charAt(i);
			}
		}
		System.out.println(output);		
	}

	
	
	
}
