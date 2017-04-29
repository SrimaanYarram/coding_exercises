package com.learning.problems.numbers;

import java.util.Scanner;

public class TimeConversion {

		/**
		 * 07:05:45PM to 19:05:45
		 * 12:12:12AM to 00:12:12
		 * 12:12:12PM to 12:12:12
		 * 24:00:12PM to 24:00:12
		 * @param args
		 */
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String time = in.next();
	        in.close();
	        String meridan = time.substring(time.length()-2, time.length());
	        int hour = Integer.parseInt(time.split(":")[0]);
	        int min = Integer.parseInt(time.split(":")[1]);
	        int sec = Integer.parseInt(time.substring(time.length()-4, time.length()-2));
	        String output = "";
	        
	        if(meridan.equalsIgnoreCase("PM")){
	        	if(hour<12){
	        		output=String.format("%02d:%02d:%02d", hour+12,min,sec);
	        		}
	        	if(hour==12){
	        		output=String.format("%02d:%02d:%02d", hour,min,sec);
        		}
	          }
	        else if (meridan.equalsIgnoreCase("AM")){
	        		output=String.format("%02d:%02d:%02d", hour,min,sec);
	        	if(hour==12){
	        		output=String.format("%02d:%02d:%02d", 00,min,sec);
	        		}
	        	}
	        
	        System.out.println(output);
	    }

}
