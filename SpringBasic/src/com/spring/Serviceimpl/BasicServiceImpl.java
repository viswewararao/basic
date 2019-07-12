package com.spring.Serviceimpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.Dao.BasicDao;

@Component
public class BasicServiceImpl {
	
	@Autowired
	private BasicDao basicDao;
	private Object phonenumber;
	
	public String getUser(String id) {
		
		String outPut="";
		Map<String,String> namesList  = new HashMap<String,String>();
		namesList=	basicDao.getUser(id);
		if (namesList.containsKey(id)){
			for(Map.Entry<String, String> name : namesList.entrySet()){
				if (id.equalsIgnoreCase(name.getKey())){
					outPut=name.getValue();
				}
			}
			
		}else{
			outPut="no id found";
			
		}
		
		return outPut;
	}
public String phonenumber1(String phonenumber) {
		
		String outPut="";
		Map<String,String> phl  = new HashMap<String,String>();
		phl =	basicDao.getPhone(phonenumber);
		if (phl.containsKey(phonenumber)){
			for(Map.Entry<String, String> ph : phl.entrySet()){
					if (phl.equals(ph.getKey())){
					
				outPut=ph.getValue();
				}
			}
			
		}else{
			outPut="no phonenumber found";
			
		}
		
		return outPut;
	}
}
//public String phonenumber(String phonenumber2) {
	// TODO Auto-generated method stub
//	return null;


