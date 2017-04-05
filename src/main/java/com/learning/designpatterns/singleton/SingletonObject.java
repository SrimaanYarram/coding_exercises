package com.learning.designpatterns.singleton;

public class SingletonObject {
	
	int a =10;
	
	private static SingletonObject so = new SingletonObject();
	
	private SingletonObject(){		
	}
	
	public static SingletonObject getInstance(){
		return so;
	}
	
	public String toString(){
		a++;
		return "Welcome to Singleton Desing pattern "  + a;
	}
	

}
