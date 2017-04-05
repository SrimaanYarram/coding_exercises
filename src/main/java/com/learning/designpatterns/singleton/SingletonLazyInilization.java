package com.learning.designpatterns.singleton;

public class SingletonLazyInilization {

	    private static SingletonLazyInilization instance = null;
	    private SingletonLazyInilization() { }

	    public static synchronized SingletonLazyInilization getInstance() {
	        if (instance == null) {
	            instance = new SingletonLazyInilization();
	        }

	        return instance;
	    }
	}



