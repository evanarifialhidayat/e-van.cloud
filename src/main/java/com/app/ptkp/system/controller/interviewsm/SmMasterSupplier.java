package com.app.ptkp.system.controller.interviewsm;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.ptkp.system.controller.interviewsm.model.SmModelSupplier;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoSupplier;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesSupplier;
import com.app.ptkp.system.util.ParamPath;

@Controller
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_SUPPLIER)
public class SmMasterSupplier {
	
	    @Autowired	private SmRepoSupplier smRepoItem;	 
	    @Autowired  private SmServicesSupplier smServicesModelItem;
	
	    @GetMapping(value = "")
	    public String home(Model model){
	    	
	    	return "sm_supplier";
	    }	    
	   
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_SUPPLIER)
	    public String form(Model model){
	    	
	    	return "sm_supplier";
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_SUPPLIER_SAVE)
		public String formsave(@ModelAttribute("name") SmModelSupplier forminput, Model model, HttpSession session, HttpServletRequest request) {
	    	smServicesModelItem.saveData(forminput);
	        return "redirect:";
	    }
	    
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_SUPPLIER_UPDATE)
  		public String formupdate(@ModelAttribute("name") SmModelSupplier forminput, Model model, HttpSession session, HttpServletRequest request) {
  	    	smServicesModelItem.updateData(forminput);
  	        return "redirect:";
  	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_SUPPLIER_LIST)
	    public String formlist(Model model){
	    	JSONArray arr = new JSONArray();
	    	SmModelSupplier obj = new SmModelSupplier();
	        String ardata = new String();
	        List listParam = (List<SmModelSupplier>) smRepoItem.findAll();
	   		if(listParam.size() > 0) {
	   			for(int i=0; i<listParam.size(); i++) {
	   				obj = (SmModelSupplier) listParam.get(i);
	   			 }
	   		}
            model.addAttribute("arr",listParam);
	            
	    	return "sm_supplier_list";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_SUPPLIER_DELETE)
	    public String delete(Model model, @RequestParam String id){
	    	SmModelSupplier obj = new SmModelSupplier();
	        obj.setId_seq(Long.parseLong(id));
	        smServicesModelItem.deleteData(obj);
	        return "redirect:/sm/supplier"+ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_SUPPLIER_LIST;
	    }

}
