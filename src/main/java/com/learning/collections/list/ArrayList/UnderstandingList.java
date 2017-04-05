package com.learning.collections.list.ArrayList;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class UnderstandingList {
	
	
	@Test
	public void usingArrayList(){
		
		List<String> family = new ArrayList<String>();
		
		family.add("Srimaan");
		family.add("Srivani");
		family.add("Srimaan");
		family.add("Srihitha");
		family.add("Tanvee");
		family.add("Aadvik");
		
		System.err.println(family);
		
		family.remove("Srimaan");
		
		System.out.println(family);
		
	}

}
