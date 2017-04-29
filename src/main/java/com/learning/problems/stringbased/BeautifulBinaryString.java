package com.learning.problems.stringbased;

import java.util.Scanner;

public class BeautifulBinaryString {
	
	/**
	 * https://www.hackerrank.com/challenges/beautiful-binary-string
	 */
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int count=0;
        for(int i=2;i<n;i++){
            if (B.charAt(i)=='0' && B.charAt(i-2)=='0' && B.charAt(i-1)=='1') {
                count++; 
                i+=2;
            }
        }
        
        System.out.print(count);
    }

}
