package com.learning.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnderstandingLinkedHashSet {
	
	 public static void main(String a[]){
		 
		 
         	//Example 1 : Using the LinkedHashSet to Preserve the order of insertion
	        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	        //add elements to HashSet
	        lhs.add("first");
	        lhs.add("fourth");
	        lhs.add("second");
	        lhs.add("third");
	        System.out.println(lhs);
	        System.out.println("LinkedHashSet size: "+lhs.size());
	        System.out.println("Is LinkedHashSet emplty? : "+lhs.isEmpty());
	        
	        System.err.println("==================Example 2: Hash Set, no order of instertion ======");
	        
	        //Example 2 : with normal HashSet (no order preserve guaranteed)
	        Set<String> hSet = new HashSet<String>();
	        //add elements to HashSet
	        hSet.add("first");
	        hSet.add("fourth");
	        hSet.add("second");
	        hSet.add("third");
	        
	        //When you print the order is not preserved where as the order is preserved in LinkedHashSet
	        System.out.println(hSet);
	        System.out.println("HashSet size: "+hSet.size());
	        System.out.println("Is HashSet emplty? : "+hSet.isEmpty());
	        
	        
	      //Example 3 :(TreeSet )
	        
	        Set<String> tSet = new TreeSet<String>();
	        //add elements to HashSet
	        tSet.add("4");
	        tSet.add("1");
	        tSet.add("5");
	        tSet.add("2");
	        tSet.add("3");
	        
	        //When you print the order is not preserved where as the order is preserved in LinkedHashSet
	        System.out.println(tSet);
	        System.out.println("HashSet size: "+tSet.size());
	        System.out.println("Is HashSet emplty? : "+tSet.isEmpty());
	        
	        
	    }
	
}
