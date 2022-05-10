package com.app.ptkp.api.controller;

import java.util.Set;

import com.app.ptkp.api.controller.logik.PanduanLogik;
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
public class IndexController {
	
    @GetMapping(value = "/")
    public String index(Model model){
        return "login";
    }

    @GetMapping(value = "/login")
    public String login(Model model){
        return "login";
    }
    


}
