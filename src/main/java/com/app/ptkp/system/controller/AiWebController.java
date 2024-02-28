package com.app.ptkp.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.ptkp.system.util.ParamPath;

@Controller
public class AiWebController {
	
	    @GetMapping(value = ParamPath.PATH_WEB_AI)
	    public String home(Model model){
	    	
	    	return "ai_home";
	    }

}
