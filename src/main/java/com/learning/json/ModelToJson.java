package com.learning.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ModelToJson {
	
	public static void main(String[] args) {

        StaffModel staff = createDummyObject();

        //1. Convert object to JSON string
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        System.out.println(json);

        //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("staff.json")) {
        	gson.toJson(staff, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static StaffModel createDummyObject() {

    	StaffModel staff = new StaffModel();
    	
    	  AddressModel address = new AddressModel();
          address.setStreet1("Hello1");
          address.setStreet2("Hello2");
          address.setZip("94536");
          
          AddressModel address1 = new AddressModel();
          address1.setStreet1("Hello111");
          address1.setStreet2("Hello2232");
          address1.setZip("94536");
          
          AddressModel address2 = new AddressModel();
          address2.setStreet1("Hello1123232");
          address2.setStreet2("Hello2232323232");
          address2.setZip("94536");
          
          List<String> skills = new ArrayList<>();
          skills.add("java");
          skills.add("python");
          skills.add("shell");
          
          List<AddressModel> addressList = new ArrayList<>();
          addressList.add(address);
          addressList.add(address1);
          addressList.add(address2);

        staff.setName("mkyong");
        staff.setAge(35);
        staff.setAddress(addressList);  
        staff.setSkills(skills);
        
        
        
        
        return staff;

    }


}
