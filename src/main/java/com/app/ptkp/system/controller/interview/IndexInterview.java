package com.app.ptkp.system.controller.interview;

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

import com.app.ptkp.system.controller.interview.model.ModelFormInput;
import com.app.ptkp.system.controller.interview.repo.RepoFormInput;
import com.app.ptkp.system.controller.interview.services.ServicesFormInput;
import com.app.ptkp.system.util.ParamPath;
import com.app.ptkp.system.util.RandomCaracter;
import com.google.zxing.WriterException;

@Controller
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_HANN_BANK)
public class IndexInterview {
	
	    @Autowired	private RepoFormInput repoFormInput;	 
	    @Autowired  private ServicesFormInput servicesFormInput;
	
	    @GetMapping(value = "")
	    public String home(Model model){
	    	
	    	return "hana";
	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_HANN_BANK_DASHBOARD)
	    public String dashboard(Model model){
	    	
	    	return "dashboard";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_HANN_BANK_FORM)
	    public String form(Model model){
	    	
	    	return "hana_form";
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_HANN_BANK_FORM_SAVE)
		public String formsave(@ModelAttribute("name") ModelFormInput forminput, Model model, HttpSession session, HttpServletRequest request) {
	    	servicesFormInput.saveData(forminput);
	        return "redirect:";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_HANN_BANK_FORM_LIST)
	    public String formlist(Model model){
	    	JSONArray arr = new JSONArray();
	        ModelFormInput obj = new ModelFormInput();
	        String ardata = new String();
	        List listParam = (List<ModelFormInput>) repoFormInput.findAll();
	   		if(listParam.size() > 0) {
	   			for(int i=0; i<listParam.size(); i++) {
	   				obj = (ModelFormInput) listParam.get(i);
	   			 }
	   		}
            model.addAttribute("arr",listParam);
	            
	    	return "hana_form_list";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_HANN_BANK_FORM_DELETE)
	    public String delete(Model model, @RequestParam String id){
	        ModelFormInput obj = new ModelFormInput();
	        obj.setId_seq(Long.parseLong(id));
	        servicesFormInput.deleteData(obj);
	        return "redirect:/hana"+ParamPath.PATH_WEB_INTERVIEW_HANN_BANK_FORM_LIST;
	    }

}
