package com.learning.problems.stringbased;

import java.util.ArrayList;
import java.util.List;

public class S_RepatedCharacters {
	
	/**
	 * This is implemented by 'sy' could be better approach
	 * @param args
	 */
	
	public static void main(String args[]){
		System.out.println(re("ABPPL ... #### $$$ T KK  "));
	 
	}
	
	public static ArrayList<String> re(String s){
		s=s+"\0";
		boolean flag = false;
		String k ="";
		List<String> li = new ArrayList<String>();
		int j=1;
		for(int i=0;i<s.length()-1;i++){
		if(s.charAt(i)==s.charAt(i+1)){
					flag = true;
					if(k.length()<2){
						k+=s.charAt(i)+""+s.charAt(i);
					}
					else{
						k+=s.charAt(i);
					}
				}
				else {
					flag = false;
					if(!k.isEmpty()){
						li.add(k);
						k="";
					}
				}
			}

		return (ArrayList<String>) li;

}
	
	
}
