package com.app.ptkp.system.controller.interviewsm;

import java.util.List;

import javax.persistence.EntityManager;
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

import com.app.ptkp.system.controller.interviewsm.model.SmModelItem;
import com.app.ptkp.system.controller.interviewsm.model.SmModelPo;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoItem;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesModelItem;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesPo;
import com.app.ptkp.system.util.ParamPath;

@Controller
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER)
public class SmMasterItem {
	
	    @Autowired	private SmRepoItem smRepoItem;	 
	    @Autowired  private SmServicesModelItem smServicesModelItem;
	    @Autowired  private SmServicesPo smServicesPo;
	    @Autowired	private EntityManager em;
	
	    @GetMapping(value = "")
	    public String home(Model model){	    	
	    	
	    	
	    	
	    	
//	    	SmModelPo p = new SmModelPo();
//	    	p.setSpo("SPO1");
//	    	SmModelItem item = new SmModelItem();
//	    	SmModelItem obj_item = em.find(SmModelItem.class,Long.parseLong(""+1)); 	    	
//	    	p.setSmModelItem(obj_item);	    	
//	    	smServicesPo.saveData(p);
	    	return "sm";
	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_DASHBOARD)
	    public String dashboard(Model model){
	    	
	    	return "sm_dashboard";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_ITEM)
	    public String form(Model model){
	    	
	    	return "sm_item";
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_ITEM_SAVE)
		public String formsave(@ModelAttribute("name") SmModelItem forminput, Model model, HttpSession session, HttpServletRequest request) {
	    	smServicesModelItem.saveData(forminput);
	        return "redirect:";
	    }
	    
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_ITEM_UPDATE)
  		public String formupdate(@ModelAttribute("name") SmModelItem forminput, Model model, HttpSession session, HttpServletRequest request) {
  	    	smServicesModelItem.updateData(forminput);
  	        return "redirect:";
  	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_ITEM_LIST)
	    public String formlist(Model model){
	    	JSONArray arr = new JSONArray();
	        SmModelItem obj = new SmModelItem();
	        String ardata = new String();
	        List listParam = (List<SmModelItem>) smRepoItem.findAll();
	   		if(listParam.size() > 0) {
	   			for(int i=0; i<listParam.size(); i++) {
	   				obj = (SmModelItem) listParam.get(i);
	   			 }
	   		}
            model.addAttribute("arr",listParam);
	            
	    	return "sm_item_list";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_ITEM_DELETE)
	    public String delete(Model model, @RequestParam String id){
	    	SmModelItem obj = new SmModelItem();
	        obj.setId_seq(Long.parseLong(id));
	        smServicesModelItem.deleteData(obj);
	        return "redirect:/sm/master"+ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_MASTER_ITEM_LIST;
	    }

}
