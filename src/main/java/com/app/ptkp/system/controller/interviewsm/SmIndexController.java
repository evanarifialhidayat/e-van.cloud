package com.app.ptkp.system.controller.interviewsm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.ptkp.system.util.ParamPath;

@Controller
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO)
public class SmIndexController {

	
	    @GetMapping(value = "")
	    public String home(Model model){
	    	
	    	return "sm";
	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_DASHBOARD)
	    public String dashboard(Model model){
	    	
	    	return "sm_dashboard";
	    }
	  
}
