package com.learning.collections.list.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class DifferentTypeOfIteratingAList {
	
	@Test
	public void usingListIterator_InfiniteLoop(){
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("4");
		list.add("6");
		list.add("8");
		
		ListIterator<String> li = list.listIterator();
		
		while(li.hasNext()){
			System.out.println(li.previousIndex()); //Shoud Carefully use previousIndex else we will fall in trap for infinite loop
		}
	}
	
	
	
	@Test
	public void usingListIterator(){
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("4");
		list.add("6");
		list.add("8");
		ListIterator<String> forward = list.listIterator();
		
		ListIterator<String> reverse = list.listIterator(list.size());
	
		while (forward.hasNext()) {
			System.out.println(forward.next());
		}
		
		while (reverse.hasPrevious()) {
			System.out.println("previous = "+reverse.previous());
		}
		
		//System.out.println(iterator.previous());
		
	}

}
