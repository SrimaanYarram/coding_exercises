package com.learning.yettosolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.internal.junit.ArrayAsserts;

public class Test {
	
	


		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int a[][] = new int[n][n];
		        for(int a_i=0; a_i < n; a_i++){
		            for(int a_j=0; a_j < n; a_j++){
		                a[a_i][a_j] = in.nextInt();
		            }
		        }
		        
		        int primary =0;
		        int secondary =0;
		        for(int i=0;i<a.length;i++){
		            for(int j=0;j<a[0].length;j++){
		                if(i==j){
		                    primary+=a[i][j];
		                }
		                
		                if(i+j==(a.length-1)){
		                	secondary+=a[i][j];
		                }
		              
		            }
		        }
		        System.out.println(secondary-primary);
		 
		  
	}

	public static void main2(String args[]){
		       Scanner in = new Scanner(System.in);
		       int n = in.nextInt();
		       int arr[] = new int[n];
		       int value=0;
		        for(int i=0; i < n; i++){
		         System.out.println(arr[i]);
		        }
		        System.out.println(arr);
		    }
		
	public void test (){
	
		String h ="KKKBBCCDD    11\0\0";
		
		System.err.println(h.substring(0,2));
		
		
		String anotherString="";
		
		boolean flag= false;
		
		int start = 0;
		
		int end=0;
		
		char l;
		
		List<String> aa= new ArrayList<String>();
		
		for(int i=1;i<h.length();i++){
			if(h.charAt(i)==h.charAt(i-1)){
					if(!flag){
						flag = true;
						start =i-1;
					}
					anotherString = h.substring(start, i+1);
					System.out.println(anotherString);
				}
			else{
				flag = false;
				if(anotherString!=null){
					aa.add(anotherString);
					anotherString="";
				}
			
				anotherString="";
			}
			
		}
		
		System.out.println(aa);
		
		
		}

}
