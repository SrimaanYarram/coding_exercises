package com.learning.collections.stack;

import java.util.Arrays;

public class SrimaanStack {
	
	private String[] stackArray;
	private int stackSize;
	private int topOfStack = -1;
	
	SrimaanStack(int size){
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input){
		if(topOfStack+1 < stackSize){
			topOfStack++;
			stackArray[topOfStack] = input;
		} else System.out.println("Sorry But the Stack is Full");
		System.out.println("PUSH " + input + " Was Added to the Stack\n");
	}
	
	public String pop(){
		if(topOfStack >= 0){
			System.out.println("POP " + stackArray[topOfStack] + " Was Removed From the Stack\n");
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		} else {
			System.out.println("Sorry But the Stack is Empty");
			return "-1";
		}
	}
	
	public String peek(){
		System.out.println("PEEK " + stackArray[topOfStack] + " Is at the Top of the Stack\n");
		return stackArray[topOfStack];
	}
	
	public static void main(String args[]){
		
		SrimaanStack ss = new SrimaanStack(10);
		
		
	
	}

	
}
