package com.learning.problems.list.transcation;

import java.util.ArrayList;
import java.util.List;

public class ReturnTranscations {
	
	public List<Transcation> getAllTranscation(){
		List<Transcation> tran = new ArrayList<Transcation>();
		for(int i=0;i<=5;i++){
			Transcation tr = new Transcation();
			tr.setAmount("100");
			tr.setCurrency("US"+i);
			tran.add(tr);
		}
		for(int i=0;i<=5;i++){
			Transcation tr = new Transcation();
			tr.setAmount("200");
			tr.setCurrency("UK"+i);
			tran.add(tr);
		}
		return tran;
	}
	 
}
