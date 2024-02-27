package com.app.ptkp.system.controller;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import javax.annotation.Resource;

import com.app.ptkp.system.controller.constanta.Param;
import com.app.ptkp.system.controller.logik.PanduanLogik;
import com.app.ptkp.system.controller.model.QrCodeRespon;
import com.app.ptkp.system.controller.model.Sertifikat;
import com.app.ptkp.system.controller.model.UserLogin;
import com.app.ptkp.system.controller.repo.SertifikatRepo;
import com.app.ptkp.system.controller.repo.UserLoginRepo;
import com.app.ptkp.system.controller.repo.t_trx_gateRepo;
import com.app.ptkp.system.controller.services.t_trx_gateService;
import com.app.ptkp.system.util.ParamPath;
import com.app.ptkp.system.util.QRCodeGenerator;
import com.app.ptkp.system.util.ResponseHandler;
import com.google.zxing.WriterException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApiMobileNfc {

	 @Autowired private PanduanLogik panduanLogik;
	 @Autowired private t_trx_gateService t_trx_gateService; 
	 @Autowired private t_trx_gateRepo tRepo;
     @Autowired	private SertifikatRepo sertifikatRepo;	 
     @Autowired	private UserLoginRepo userLoginRepo;	

    

    @RequestMapping(value = ParamPath.PATH_MOBILE_NFC, method = RequestMethod.GET)
    public ResponseEntity<Object> apiIndex(Model model){    	
        try {
            JSONArray arr = new JSONArray();
            UserLogin obj = new UserLogin();
            List<UserLogin> listParam = (List<UserLogin>) userLoginRepo.findAll();
               if(listParam.size() > 0) {
                   for(int i=0; i<listParam.size(); i++) {
                       obj = (UserLogin) listParam.get(i);               
                       arr.add(obj);
                   }
               }
             
            return ResponseHandler.generateResponse("OK", HttpStatus.OK, arr.get(0).toString());
        } catch (Exception e) {
        	return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
            
    }
    
    @RequestMapping(value = ParamPath.PATH_MOBILE_EXAMPLE, method = RequestMethod.GET)
    public ResponseEntity<Object> apiIndexExample(Model model){    	
        try {
            JSONArray arr = new JSONArray();
            UserLogin obj = new UserLogin();
            List<UserLogin> listParam = (List<UserLogin>) userLoginRepo.findAll();
               if(listParam.size() > 0) {
                   for(int i=0; i<listParam.size(); i++) {
                       obj = (UserLogin) listParam.get(i);               
                       arr.add(obj);
                   }
               }
             
            return ResponseHandler.generateResponse("OK", HttpStatus.OK, arr.get(0).toString());
        } catch (Exception e) {
        	return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
            
    }

}
