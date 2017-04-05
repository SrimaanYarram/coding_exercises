package com.learning.problems.printing;

public class pyramidPrinting {
	
	//First print the number of rows that number of spaces
	//Print the number based on the current Row say for example if the row is 1 then print 1, so to do that iterate that number of times
	//i.e first 1, 2nd iteration 2 (will be incremented)
	
	public static void main(String args[]){
		
		 int noOfRows = 9;
		 
		int numberOfRows = 1;
		
		
		for(int i =noOfRows;i>0;i--){
		
			//Printing i spaces at the beginning of each row
			 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
			
          //Printing 'rowCount' value 'rowCount' times at the end of each row
            
            for (int j = 1; j <= numberOfRows; j++)
            {
                System.out.print(numberOfRows+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
            numberOfRows++;
			
		}
		
		
		
	}
}
