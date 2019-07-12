
package com.spring.controler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.spring.handler.BasicHandler;

@Controller
class BasicControler{
	
	@Autowired
	private BasicHandler basicHandler;
	
	@RequestMapping(value = "/getUserName", method = RequestMethod.GET)
	public String getUserName(@RequestBody String id) {
		String outPut="";
		Map<String,String> namesList  = new HashMap<String,String>();
		namesList.put("101","a");
		namesList.put("102","ab");
		namesList.put("103","ac");
		namesList.put("104","ad");
		
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
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public String getUser(@RequestBody String id) {
		return  basicHandler.getUser(id);
	
	}
	@RequestMapping(value="/getphonenumber", method=RequestMethod.GET)
	public List<String> getphonenumber(@RequestBody String id){
		List<String> outPut= new ArrayList<String>();
		Map<String,String>phoneList=new HashMap<String,String >();
		phoneList.put("101","9989425106");
		phoneList.put("102","7975164818");
		phoneList.put("103","8073109650");
		phoneList.put("104","8074522327");
		
		/*Map<String,String> namesList  = new HashMap<String,String>();
		namesList.put("101","a");
		namesList.put("102","ab");
		namesList.put("103","ac");
		namesList.put("104","ad");*/
		
		
		if(phoneList.containsKey(id)){
			for(Map.Entry<String, String>phl: phoneList.entrySet()){
				if(id.equalsIgnoreCase(phl.getKey())){
					outPut.add(phl.getValue());
					outPut.add(getUserName(id));
				}
				
			}
			
			/*for(Map.Entry<String, String> name : namesList.entrySet()){
				if (id.equalsIgnoreCase(name.getKey())){
					outPut.add(name.getValue());
				}
			}*/
			
		}else{
			outPut.add("no id found in DB");
		}
		return outPut;
	
	}

		
	
		// TODO Auto-generated method stub
		
	
@RequestMapping(value = "/getphonenumber", method = RequestMethod.GET)
public String getphonenumber1 (@RequestBody String phonenumber) {
	return  basicHandler.getphonenumber(phonenumber);


}
}

	
