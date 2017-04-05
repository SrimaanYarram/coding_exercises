package com.learning.collections.stack;

import java.util.Stack;

public class StackExample {
	
	public static void main(String args[]){
		
		 Stack<String> st = new Stack<String>();
		 	// populating stack
		   st.push("Java");
		   st.push("Source");
		   st.push("code");
		   
		   System.out.println(st);
		   System.out.println(st.pop());
		   
	}

}
