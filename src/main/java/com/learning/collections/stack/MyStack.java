package com.learning.collections.stack;

import java.util.Arrays;

public class MyStack {
	private int stackSize;

	public MyStack(int size) {
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}

	private String[] stackArray;

	static private int pointer = 0;

	public void pop() {
		System.out.println("POP " + stackArray[pointer] + " Was deleted from the Stack\n");

		stackArray[pointer] = "-1";
		pointer--;

	}

	public void push(String element) {
		pointer++;
		stackArray[pointer] = element;
		System.out.println("PUSH " + element + " Was Added to the Stack\n");

	}

	public String seek() {
		return stackArray[pointer];
	}

	public static void main(String args[]) {

		MyStack theStack = new MyStack(10);

		theStack.push("1");
		theStack.push("2");
		theStack.push("3");

		System.out.println(theStack.seek());
		theStack.pop();

		System.out.println(theStack.seek());

		theStack.push("4");

		theStack.push("5");

		theStack.push("6");

		System.out.println(theStack.seek());
	}

}
