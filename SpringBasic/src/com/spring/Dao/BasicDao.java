package com.spring.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class BasicDao {

	public Map<String, String> getUser(String id) {
		Map<String,String> namesList  = new HashMap<String,String>();
		namesList.put("101","a pallavi");
		namesList.put("102","ab");
		namesList.put("103","ac");
		namesList.put("104","ad");
		
		
		
		return namesList;
	}
	
	public Map<String, String> getPhone(String id) {
		Map<String,String> PhoneList  = new HashMap<String,String>();
		PhoneList.put("101","3354654");
		PhoneList.put("102","5243545");
		PhoneList.put("103","254354");
		PhoneList.put("104","2435435");
		
		
		
		return PhoneList;
	}

	

}
