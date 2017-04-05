package com.learning.problems.stringbased;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseNotation {

	public static void main(String[] args) {
		
		String pattern = "HM";
		
		List<String> className =  new ArrayList<String>();
		className.add("HelloMars");
		className.add("HelloWorld");
		className.add("HelloWorldMars");
		className.add("HiHo");
	
		for(String s : className){
			if(s.contains(pattern)){
				System.out.println(s);
			}
		}
		

	}

}
