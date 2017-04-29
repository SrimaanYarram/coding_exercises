package com.learning.design.patterns.observer;

import java.util.Scanner;

public class ObserverDemo {
	  public static void main( String[] args ) {
	    Subject sub = new Subject();
	    // Client configures the number and type of Observers
	    new HexObserver( sub );
	    new OctObserver( sub );
	    new BinObserver( sub );
	    Scanner scan = new Scanner(System.in);
	    while (true) {
	      System.out.print( "\nEnter a number: " );
	      sub.setState( scan.nextInt() );
	    }
	  }
	}