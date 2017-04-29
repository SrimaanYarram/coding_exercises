package com.learning.problems.arrays;


/**
 *	 Input  : arr[] = {1, 2, 3, 4, 5, 6, 7} 
	Output : arr[] = {7, 1, 6, 2, 5, 3, 4}
 * @author syarram
 *
 */


public class ReArrangeArrayMaxMinForm {
	
	public void testWithAdditionalArray(){
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int temp[] = new int[arr.length];
		int small=0, large=arr.length-1;
		boolean flag = true;
		 for (int i=0; i<arr.length; i++)
		    {
		        if (flag)
		        	temp[i] = arr[large--];
		        else
		        	temp[i] = arr[small++];
		        flag = !flag;
		    }
		}
	
	
	public void testWithoutAdditionalArray(){
		
	}

}
