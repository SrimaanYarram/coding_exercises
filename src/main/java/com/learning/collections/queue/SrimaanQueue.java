package com.learning.collections.queue;

import java.util.Arrays;

public class SrimaanQueue {
	
	private String[] queueArray;
	private int queueSize;

	
	private int front, numberOfItems, rear = 0;
	
	SrimaanQueue(int size){
		queueSize = size;
		queueArray = new String[size];
		Arrays.fill(queueArray, "-1");
	}
	
	public void insert(String input){
		if(numberOfItems + 1 <= queueSize){
			queueArray[rear] = input;
			rear++;
			numberOfItems++;
			System.out.println("INSERT " + input + " Was Added to the Queue\n");
		
		} else {
			System.out.println("Sorry But the Queue is Full");
		}
	}
	public void remove(){
		if(numberOfItems > 0){
			System.out.println("REMOVE " + queueArray[front] + " Was Removed From the Queue\n");
			// Just like in memory an item isn't deleted, but instead is just not available
			queueArray[front] = "-1";
			front++;
			numberOfItems--;
	
	} else {
		System.out.println("Sorry But the Queue is Empty");
	}
	
}

}
