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

import com.app.ptkp.system.controller.interviewsm.model.SmModelCustommer;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoCustommer;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesCustommer;
import com.app.ptkp.system.util.ParamPath;

@Controller
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_CUSTOMMER)
public class SmMasterCustommer {
	
	    @Autowired	private SmRepoCustommer smRepoItem;	 
	    @Autowired  private SmServicesCustommer smServicesModelItem;
	
	    @GetMapping(value = "")
	    public String home(Model model){
	    	
	    	return "sm_custommer";
	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_DASHBOARD)
	    public String dashboard(Model model){
	    	
	    	return "sm_dashboard";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_CUSTOMMER)
	    public String form(Model model){
	    	
	    	return "sm_custommer";
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_CUSTOMMER_SAVE)
		public String formsave(@ModelAttribute("name") SmModelCustommer forminput, Model model, HttpSession session, HttpServletRequest request) {
	    	smServicesModelItem.saveData(forminput);
	        return "redirect:";
	    }
	    
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_CUSTOMMER_UPDATE)
  		public String formupdate(@ModelAttribute("name") SmModelCustommer forminput, Model model, HttpSession session, HttpServletRequest request) {
  	    	smServicesModelItem.updateData(forminput);
  	        return "redirect:";
  	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_CUSTOMMER_LIST)
	    public String formlist(Model model){
	    	JSONArray arr = new JSONArray();
	    	SmModelCustommer obj = new SmModelCustommer();
	        String ardata = new String();
	        List listParam = (List<SmModelCustommer>) smRepoItem.findAll();
	   		if(listParam.size() > 0) {
	   			for(int i=0; i<listParam.size(); i++) {
	   				obj = (SmModelCustommer) listParam.get(i);
	   			 }
	   		}
            model.addAttribute("arr",listParam);
	            
	    	return "sm_custommer_list";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_CUSTOMMER_DELETE)
	    public String delete(Model model, @RequestParam String id){
	    	SmModelCustommer obj = new SmModelCustommer();
	        obj.setId_seq(Long.parseLong(id));
	        smServicesModelItem.deleteData(obj);
	        return "redirect:/sm/custommer"+ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_CUSTOMMER_LIST;
	    }

}
