package com.learning.problems.list.transcation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void main(String args[]){
		Map<String, List<Transcation>> map = new HashMap<String, List<Transcation>>();
		ReturnTranscations rt = new ReturnTranscations();
		List<Transcation> all = rt.getAllTranscation();
		for(Transcation t : all){
			if(map.containsKey(t.getCurrency())){
				List<Transcation> in =	map.get(t.getCurrency());
				in.add(t);
			}
			else{
				List<Transcation> in = new ArrayList<Transcation>();
				in.add(t);
				map.put(t.getCurrency(), in);
			}
		}

		List<Transcation>it = map.get("US1");
		System.err.println(it.size());
		for(Transcation tk : it){
			System.out.println(tk.getAmount());
			System.out.println(tk.getCurrency());
			System.out.println("--------------------------------");
		}
		
		
	}

}
