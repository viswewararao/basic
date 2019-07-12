package com.spring.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.service.BasicService;

@Component
public class BasicHandler {
	
	@Autowired
	private BasicService  bAsicServic;

	public String getUser(String id) {
String output="";
		if (id !=null){
			output=bAsicServic.getUser(id);
			
		}
		return output;
		
	}
	public String getphonenumber(String id) {
		String output="";
				if (id !=null){
					output=bAsicServic.getphonenumber(id);
					
				}
				return output;
				
			}

}
