package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.Serviceimpl.BasicServiceImpl;

@Component
public class BasicService {
	
	@Autowired
	private BasicServiceImpl basicServiceImpl;

	public String getUser(String id) {
		// TODO Auto-generated method stub
		return basicServiceImpl.getUser(id);
	}
     public String getphonenumber(String phonenumber){
    	 return basicServiceImpl.phonenumber1(phonenumber);
 	}
     }

