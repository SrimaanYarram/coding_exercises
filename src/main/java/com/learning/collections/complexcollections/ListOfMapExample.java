package com.learning.collections.complexcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListOfMapExample {
	
	
	public static void main(String args[]){
		
		List<Map<String, String>> listOfMap = new ArrayList<Map<String, String>>();
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "One");
		map1.put("2", "Two");
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("11", "OneOne");
		map2.put("22", "TwoTwo");
		
		listOfMap.add(map1);
		listOfMap.add(map2);
		
		//Reterive elements
		
		for (Map<String, String> map : listOfMap) {
			
			for(Map.Entry<String, String> entry: map.entrySet()){
				
				System.out.println(entry.getValue() + ":" + entry.getKey());
				
				
			}
			
		}
		
	}

}
