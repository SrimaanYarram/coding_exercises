package com.learning.yettosolve;

public class CharacterCountInString {
	
	public static void main(String[] args){
		CharacterCountInString cout = new CharacterCountInString();
		//System.out.println(cout.testUsingStringBufferApproach());
		System.out.println(cout.testUsingStringApproach());
	}
	
	
	public String testUsingStringApproach(){
		String input = "aaabbccddefghijkl";
		String output = "";
		int count = 1;
		char last = input.charAt(0);
		for(int i=1;i<input.length();i++){
			if(input.charAt(i)==last){
				count++;
			}
			else{
				output+= last +""+count;
				last=input.charAt(i);
				count=1;				
			}
		}
		return output + last + count;
	}
	
	
	public String testUsingStringBufferApproach(){
		
		
		String input = "aaabbccddefghijkl";
		StringBuffer output = new StringBuffer();
		int count = 1;
		char last = input.charAt(0);
		for(int i=1;i<input.length();i++){
			if(input.charAt(i)==last){
				count++;
			}
			else{
				output.append(last);
				output.append(count);
				last=input.charAt(i);
				count=1;				
			}
		}
		
		output.append(last);
		output.append(count);
		
		return output.toString();
		
		
	}

}
