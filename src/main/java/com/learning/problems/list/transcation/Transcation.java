package com.learning.problems.list.transcation;


public class Transcation {
	
	private String currency;
	
	private String amount;
	
	public String getCurrency(){
		return currency;
	}
	
	public String getAmount(){
		return amount;
	}
	
	public void setAmount(String amount){
		this.amount = amount;
	}
	
	public void setCurrency(String currency){
		this.currency = currency;
	}

}
