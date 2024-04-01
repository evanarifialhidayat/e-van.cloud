package com.app.ptkp.system.controller.interviewsm;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.ptkp.system.controller.interviewsm.model.SmModelUser;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoUser;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesUser;
import com.app.ptkp.system.util.ParamPath;
import com.app.ptkp.system.util.RandomCaracter;
import com.google.zxing.WriterException;

@Controller
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_SETTING)
public class SmSettingController {
	
	    @Autowired	private SmRepoUser smRepoUser;	 
	    @Autowired  private SmServicesUser smServicesUser;
	
	    @GetMapping(value = "")
	    public String home(Model model){
	    	
	    	return "sm";
	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_DASHBOARD)
	    public String dashboard(Model model){
	    	
	    	return "sm_dashboard";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_FORM)
	    public String form(Model model){
	    	
	    	return "sm_form";
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_FORM_SAVE)
		public String formsave(@ModelAttribute("name") SmModelUser forminput, Model model, HttpSession session, HttpServletRequest request) {
	    	smServicesUser.saveData(forminput);
	        return "redirect:";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_FORM_LIST)
	    public String formlist(Model model){
	    	JSONArray arr = new JSONArray();
	        SmModelUser obj = new SmModelUser();
	        String ardata = new String();
	        List listParam = (List<SmModelUser>) smRepoUser.findAll();
	   		if(listParam.size() > 0) {
	   			for(int i=0; i<listParam.size(); i++) {
	   				obj = (SmModelUser) listParam.get(i);
	   			 }
	   		}
            model.addAttribute("arr",listParam);
	            
	    	return "sm_form_list";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_FORM_DELETE)
	    public String delete(Model model, @RequestParam String id){
	    	SmModelUser obj = new SmModelUser();
	        obj.setId_seq(Long.parseLong(id));
	        smServicesUser.deleteData(obj);
	        return "redirect:/sm/setting"+ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_FORM_LIST;
	    }

}
