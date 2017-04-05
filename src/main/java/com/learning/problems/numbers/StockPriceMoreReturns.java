package com.learning.problems.numbers;

public class StockPriceMoreReturns {
	
	static int highestIndex = 0;
	
	static int lowestIndex = 0;
	
	public static void main(String args[]){
		  int[] stockPricesYesterday = new int[]{5,24,10, 2, 7, 25, 8, 11, 9};
		  System.out.println(getHighestValue(stockPricesYesterday));
		  System.out.println(getLowestValue(stockPricesYesterday, highestIndex));
			
		  //returns 6 (buying for $5 and selling for $11)
	}
	
	
	public static int getHighestValue(int[] stockPrice){
		int highestValue = 0;
		for(int i=0;i<stockPrice.length;i++){
			if(highestValue<=stockPrice[i]){
				highestValue=stockPrice[i];
				highestIndex = i;
			}
		}
		return highestIndex;
		}
	
	public static int getLowestValue(int[] stockPrice, int index){
		int highestValue = stockPrice[index];
		for(int i=index;i>0;i--){
			if(stockPrice[i]<highestValue){
				highestValue = stockPrice[i];
				index = i;
			}
		}
		return index;
		}
	}


