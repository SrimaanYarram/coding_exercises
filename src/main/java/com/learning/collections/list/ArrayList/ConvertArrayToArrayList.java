package com.learning.collections.list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertArrayToArrayList {
	
	@Test
	public void arrayAsList(){
		String a [] = {"Srimaan", "Srivani", "Srihitha", "Tanvee", "Aadvik"};
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(a));
		System.out.println("Using Array as List Constructor " + arrayList);
	}
	
	@Test
	public void usingListAndArrayAsList(){
		String a [] = {"Srimaan", "Srivani", "Srihitha", "Tanvee", "Aadvik"};
		List<String> list = Arrays.asList(a);
		System.out.println("using List and ArrayAsList " + list);
	}
	
	@Test
	public void usingCollections(){
		String a [] = {"Srimaan", "Srivani", "Srihitha", "Tanvee", "Aadvik"};
		List<String> list = new ArrayList<String>(a.length);
		Collections.addAll(list, a);
		Collections.sort(list);
		System.out.println("Using Collections and Sort " + list);
	}
	
	@Test
	public void listToArray(){
		
		List<String> list = new ArrayList<String>();
		
		list.add("Srimaan");
		list.add("Srivani");
		list.add("Srihitha");
		list.add("Tanvee");
		list.add("Aadvik");
		
		String[] family =  list.toArray(new String[list.size()]);
		System.out.println(family);
		
		Assert.assertEquals(list.toArray(), family);
	}
	

}
