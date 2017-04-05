package com.learning.generics;

public class UsingGeneric {
	
	public static void main(String args[]){
		
		SimpleGeneric<Integer> integer = new SimpleGeneric<Integer>(5);
		System.out.println(integer.showMeSrimaan());
		
		SimpleGeneric<String> st = new SimpleGeneric<String>("Test");
		System.out.println(st.showMeSrimaan());
		
	}

}
