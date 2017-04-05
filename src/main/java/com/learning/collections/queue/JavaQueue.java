package com.learning.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
	
	public static void main(String args[]){
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(25);
		
		queue.add(30);
		
		System.out.println(queue.poll());
		
		
		
	}

}
