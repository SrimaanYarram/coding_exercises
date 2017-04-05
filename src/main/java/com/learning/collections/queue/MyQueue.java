package com.learning.collections.queue;

public class MyQueue {
	
	String[] queue;
	int sizeOfQueue;
	int rear=0;
	int front =0;
	
	public MyQueue(int size){
		sizeOfQueue = size;
		queue = new String[size];
	}
	
	
	public void insert(String element){
		queue[rear] = element;
		System.out.println("Added " + element + " to the queue");
		rear++;
	}
	
	public void remove(){
		System.out.println(queue[front] + " removed to the queue");
		queue[front] = "-1";
		front++;
	}
	
	public String seek(){
		return queue[front];
	}

	
	public static void main(String args[]){
		MyQueue que = new MyQueue(10);
		que.insert("10");
		que.insert("20");
		que.insert("30");
		que.insert("40");
		System.out.println(que.seek());
		que.remove();
		System.out.println(que.seek());
		que.insert("40");
		que.remove();
		System.out.println(que.seek());
	}
}
