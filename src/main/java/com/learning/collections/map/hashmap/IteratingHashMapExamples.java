package com.learning.collections.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class IteratingHashMapExamples {
	
	@Test
	public void iteratingOverKeysAndValuesUsingForEach(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(18, "Charming");
		map.put(19, "Young & Charming");
		map.put(20, "Young");
		map.put(25, "Youth");
		map.put(25, "Youth1");
		
		//KeySet() will return set of items no duplicates 
		//Not in HashMap duplicates are allowed but it will be over ridden
		
		//iterating over keys only
		for (Integer key : map.keySet()) {
		    System.out.println("Key = " + key);
		}

		//iterating over values only
		for (String value : map.values()) {
		    System.out.println("Value = " + value);
		}
	}

	
	@Test
	public void iteratingOverEntriesUsingForEach(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(18, "Charming");
		map.put(19, "Young & Charming");
		map.put(20, "Young");
		map.put(25, "Youth");
		map.put(25, "Youth1");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	
	
	
	@Test
	public void iteratingUsingIterator(){
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(18, "Charming");
		map.put(19, "Young & Charming");
		map.put(20, "Young");
		map.put(25, "Youth");
		map.put(25, "Youth1");
		Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<Integer, String> entry = entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	
	
	//Every time you will get a single entry and then print values
	
	@Test
	public void iteratingWithoutGenerics(){
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(18, "Charming");
		map.put(19, "Young & Charming");
		map.put(20, "Young");
		map.put(25, "Youth");
		map.put(25, "Youth1");
		Iterator<?> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry entry = (Map.Entry) entries.next();
		    Integer key = (Integer)entry.getKey();
		    String value = (String)entry.getValue();
		    System.out.println("Key = " + key + ", Value = " + value);
		}
	}
}
