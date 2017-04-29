package com.learning.problems.printing;

import java.util.Scanner;

public class PrintStairCase {
 
/**
 * Refer 	:  https://www.hackerrank.com/challenges/staircase
 * 
 * Output: If the input is given as 6 then 
     #
    ##
   ###
  ####
 #####
######
 * @param args
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String s ="";
        for(int l=0;l<n;l++){
            s+="#";
            for(int i=n;i>l;i--){
                 System.out.print(" ");
            }
             System.out.print(s +"\n");
        }
  }
}
    
 
