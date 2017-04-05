package com.learning.generics;

public class SimpleGeneric<Srimaan> {
	
	Srimaan a;
	
	SimpleGeneric(Srimaan type){
		a=type;
	}
	
	public String showMeSrimaan(){
		
		return a.getClass().getName();
	}

}
