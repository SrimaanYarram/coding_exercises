package com.learning.design.patterns.observer;

class OctObserver extends Observer { 
	  public OctObserver( Subject s ) {
	    subj = s;
	    subj.attach( this );
	  } 
	  public void update() {
	    System.out.print( " " + Integer.toOctalString( subj.getState() ) );
	  } 
	}