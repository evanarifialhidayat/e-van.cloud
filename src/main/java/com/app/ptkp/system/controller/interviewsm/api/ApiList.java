package com.app.ptkp.system.controller.interviewsm.api;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ptkp.system.controller.interviewsm.model.SmModelCustommer;
import com.app.ptkp.system.controller.interviewsm.model.SmModelItem;
import com.app.ptkp.system.controller.interviewsm.model.SmModelSupplier;
import com.app.ptkp.system.controller.interviewsm.model.SmModelUser;
import com.app.ptkp.system.controller.interviewsm.model.json.ModelJson;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoCustommer;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoItem;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoSupplier;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesModelItem;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesPo;
import com.app.ptkp.system.util.ParamPath;

@RestController
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_LIST)
public class ApiList {

	    @Autowired	private SmRepoItem smRepoItem;	 
	    @Autowired	private SmRepoSupplier smRepoSupplier;	 
	    @Autowired	private SmRepoCustommer smRepoCustommer;	 
	    @Autowired  private SmServicesModelItem smServicesModelItem;
	    @Autowired	private EntityManager em; 
	    List datajson = null;
	   
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_ITEM_LIST)
	    public ResponseEntity<ModelJson> listitem(){	    
	    	datajson = new ArrayList(); 
	    	ModelJson res = new ModelJson();
	    	for(SmModelItem i : smRepoItem.findAll()) {
	    	    datajson.add(i);
	    	}
	    	
	    	if(datajson == null) {
	    		res.setResult(false);
		    	res.setErrors("404");
		    	res.setList(datajson);
	    	}else {
	    		res.setResult(true);
		    	res.setErrors("SUCCESS");
		    	res.setList(datajson);
	    	}
	    	
	    	return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(res);
	    }
	    @GetMapping(ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_ITEM_BY_CODE)
	    public ResponseEntity<ModelJson> listitembycode(@PathVariable ("scode") String scode){	    
	    	datajson = new ArrayList(); 
	    	ModelJson res = new ModelJson();
	    	SmModelItem i = smRepoItem.findScode(scode);
	    	
	    	if(i != null) datajson.add(i);
	    	
	    	if(datajson == null) {
	    		res.setResult(false);
		    	res.setErrors("404");
		    	res.setList(datajson);
	    	}else {
	    		res.setResult(true);
		    	res.setErrors("SUCCESS");
		    	res.setList(datajson);
	    	}
	    	
	    	return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(res);
	    }
	    
	    
	    
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_SUPPLIER_LIST)
	    public ResponseEntity<ModelJson> listsupplier(){	    
	    	datajson = new ArrayList(); 
	    	ModelJson res = new ModelJson();
	    	for(SmModelSupplier i : smRepoSupplier.findAll()) {
	    	    datajson.add(i);
	    	}
	    	
	    	if(datajson == null) {
	    		res.setResult(false);
		    	res.setErrors("404");
		    	res.setList(datajson);
	    	}else {
	    		res.setResult(true);
		    	res.setErrors("SUCCESS");
		    	res.setList(datajson);
	    	}
	    	
	    	return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(res);
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_API_CUSTOMMER_LIST)
	    public ResponseEntity<ModelJson> listcustommer(){	    	
	    	datajson = new ArrayList(); 
	    	ModelJson res = new ModelJson();
	    	for(SmModelCustommer i : smRepoCustommer.findAll()) {
	    	    datajson.add(i);
	    	}
	    	
	    	if(datajson == null) {
	    		res.setResult(false);
		    	res.setErrors("404");
		    	res.setList(datajson);
	    	}else {
	    		res.setResult(true);
		    	res.setErrors("SUCCESS");
		    	res.setList(datajson);
	    	}
	    	
	    	return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(res);
	    }
}
