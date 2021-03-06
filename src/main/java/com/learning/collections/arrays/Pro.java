package com.learning.collections.arrays;

public class Pro {
	
	public static void main(String args[]){
		
		Pro p = new Pro();
		System.out.println(p.getProductsOfAllIntsExceptAtIndex(new int[]{1,5,10,15,20}).length);
	}
	
	public int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

	    // we make an array with the length of the input array to
	    // hold our products
	    int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

	    // for each integer, we find the product of all the integers
	    // before it, storing the total product so far each time
	    

	    int productSoFar = 1;
	    for (int i = 0; i < intArray.length; i++) {
	        productsOfAllIntsExceptAtIndex[i] = productSoFar;
	        productSoFar *= intArray[i];
	       System.out.println("productSoFar = " + productSoFar);
	       System.out.println("productsOfAllIntsExceptAtIndex = " + productsOfAllIntsExceptAtIndex[i]);
	       System.out.println("intArray = " + intArray[i]);
	       System.out.println("------------------------------------------------------------------");

	    }
	    
	   
	    // for each integer, we find the product of all the integers
	    // after it. since each index in products already has the
	    // product of all the integers before it, now we're storing
	    // the total product of all other integers
	    productSoFar = 1;
	    for (int i = intArray.length - 1; i >= 0; i--) {
	        productsOfAllIntsExceptAtIndex[i] *= productSoFar;
	        productSoFar *= intArray[i];
	    }

	    return productsOfAllIntsExceptAtIndex;
	}

}
