package com.app.ptkp.system.controller.interviewsm.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ptkp.system.controller.interviewsm.model.SmModelCustommer;
import com.app.ptkp.system.controller.interviewsm.model.SmModelItem;
import com.app.ptkp.system.controller.interviewsm.model.SmModelSupplier;
import com.app.ptkp.system.controller.interviewsm.model.SmModelUser;
import com.app.ptkp.system.controller.interviewsm.model.json.BodyJson;
import com.app.ptkp.system.controller.interviewsm.model.json.ModelJson;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoCustommer;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoItem;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoSupplier;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesCustommer;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesModelItem;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesPo;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesSupplier;
import com.app.ptkp.system.util.ParamPath;

@RestController
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_CREATE)
public class ApiCreate {

	    @Autowired  private SmServicesModelItem smServicesModelItem;
	    @Autowired  private SmServicesCustommer smServicesCustommer;
	    @Autowired  private SmServicesSupplier smServicesSupplier;
	    List datajson = new ArrayList(); 
	    
	    
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_ITEM_CREATE)
	    public ResponseEntity<?> cretaeitem(@RequestBody BodyJson bodyparam,HttpSession session , HttpServletRequest request){	 
	    	HashMap<String, Object> result = new HashMap<>();
	    	SmModelItem item = new SmModelItem();
	    	item.setScode(bodyparam.getScode());
	    	item.setSname(bodyparam.getSname());
	    	item.setSuom(bodyparam.getSuom());
	    	item.setSharga(bodyparam.getSharga());
	    	try {
	    		smServicesModelItem.saveData(item);
	    		result.put("status", "OK");  
			} catch (Exception e) {
				result.put("status", "EROR");  
			}
	    
	     return new ResponseEntity<>(result, HttpStatus.OK);
	    	
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_SUPPLIER_CREATE)
	    public ResponseEntity<?> cretaesupplier(@RequestBody BodyJson bodyparam,HttpSession session , HttpServletRequest request){	 
	    	HashMap<String, Object> result = new HashMap<>();
	    	SmModelSupplier item = new SmModelSupplier();
	    	item.setScode(bodyparam.getScode());
	    	item.setSname(bodyparam.getSname());
	    	item.setSalamat(bodyparam.getSalamat());
	    	try {
	    		smServicesSupplier.saveData(item);
	    		result.put("status", "OK");  
			} catch (Exception e) {
				result.put("status", "EROR");  
			}
	    
	     return new ResponseEntity<>(result, HttpStatus.OK);
	    	
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_CUSTOMMER_CREATE)
	    public ResponseEntity<?> cretaecustommer(@RequestBody BodyJson bodyparam,HttpSession session , HttpServletRequest request){	 
	    	HashMap<String, Object> result = new HashMap<>();
	    	SmModelCustommer item = new SmModelCustommer();
	    	item.setScode(bodyparam.getScode());
	    	item.setSname(bodyparam.getSname());
	    	item.setSalamat(bodyparam.getSalamat());
	    	try {
	    		smServicesCustommer.saveData(item);
	    		result.put("status", "OK");  
			} catch (Exception e) {
				result.put("status", "EROR");  
			}
	    
	     return new ResponseEntity<>(result, HttpStatus.OK);
	    	
	    }
	    
	    
	    //curl -H "Content-Type: application/json" -X POST -d '{"scode":"bob","sname":"bob name","suom":"kg","sharga":"20"}' http://localhost:8080/sm/api/create/item
	    //curl -H "Content-Type: application/json" -X POST -d '{"scode":"bob c","sname":"bob name ceribon","salamat":"ceribon"}' http://localhost:8080/sm/api/create/supplier
	    //curl -H "Content-Type: application/json" -X POST -d '{"scode":"bob p","sname":"bob name pemalang","salamat":"pemalang"}' http://localhost:8080/sm/api/create/custommer
	    
}
