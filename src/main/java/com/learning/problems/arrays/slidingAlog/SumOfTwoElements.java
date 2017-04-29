package com.learning.problems.arrays.slidingAlog;

import java.util.HashMap;

import org.testng.annotations.Test;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *	The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * 	You may assume that each input would have exactly one solution and you may not use the same element twice.
 *	Input: numbers={2, 7, 11, 15}, target=9
 *	Output: index1=1, index2=2
 * 
 */

public class SumOfTwoElements {
	
	int numbers[] = {1,4,8,2,3,6};
		
		 int target = 7;
		
		@Test
		public void bruteForceApproach(){	
			for(int i=0;i<numbers.length;i++){
				for(int j=1;j<i;j++){
					if(numbers[i]+numbers[j]==target){
						System.out.println(numbers[i] +  " " + numbers[j]);
					}
				}
			}
		}
		
		@Test
		public void twoUsingHashMap() {
	        
	        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	        for(int i = 0; i < numbers.length; i++){
	        	Integer diff = (Integer)(target - numbers[i]);
	            if(hash.containsKey(diff)){
	                int toReturn[] = { hash.get(diff)+1, i+1 };
	               System.out.println(toReturn);
	            }
	            hash.put(numbers[i], i);
	        }
	        
	    }
			
		@Test
		public void usingHashMap() {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int[] result = new int[2];
		 	for (int i = 0; i < numbers.length; i++) {
				if (map.containsKey(numbers[i])) {
					int index = map.get(numbers[i]);
					result[0] = index ;
					result[1] = i;
					System.out.println(result[0] + "" + result[1]);
				} else {
					map.put(target - numbers[i], i);
				}
			}
		 

		    }

	}


