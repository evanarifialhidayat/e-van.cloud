package com.app.ptkp.api.controller;
import com.app.ptkp.api.controller.logik.PanduanLogik;
import com.app.ptkp.api.controller.repo.t_trx_gateRepo;
import com.app.ptkp.api.controller.services.t_trx_gateService;
import com.app.ptkp.api.util.ResponseHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApiController {

	 @Autowired private PanduanLogik panduanLogik;
	 @Autowired private t_trx_gateService t_trx_gateService; 
	 @Autowired private t_trx_gateRepo tRepo;

    
    @RequestMapping(value = "/transaction/api/t_trx_gate", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> apiTransactionTrx(Model model){    	
        try {
            return ResponseHandler.generateResponse("OK", HttpStatus.OK, t_trx_gateService.findAllData());
        } catch (Exception e) {
        	return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
            
    }
    

}
