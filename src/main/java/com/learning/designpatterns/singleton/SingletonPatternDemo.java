package com.learning.designpatterns.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// illegal construct Compile Time Error: The constructor SingleObject()  is not visible
		// SingleObject sop = new SingleObject();
		// Get the only object available
		SingletonObject object = SingletonObject.getInstance();
		System.out.println(object);
		SingletonObject object1 = SingletonObject.getInstance();
		System.out.println(object1);
	}
	
	

}
