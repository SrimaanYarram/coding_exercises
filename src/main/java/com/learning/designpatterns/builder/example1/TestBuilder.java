package com.learning.designpatterns.builder;

public class TestBuilder {
	
	public static void main(String args[]){
		
		Cake cake = new Cake.Builder().sugar(1).butter(0.5).build();
		
		System.out.println(cake.toString());
		
	}

}
