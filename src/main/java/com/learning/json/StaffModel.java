package com.learning.json;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StaffModel {
	
	private String name;
	private int age;
	private String position;
	private List<AddressModel> address;
	private List<String> skills;


	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setPosition(String position){
		this.position = position;
	}
	
	public void setAddress(List<AddressModel> address){
		this.address = address;
	}
	
	public void setSkills(List<String> skills){
		this.skills = skills;
	}
	
	
}
