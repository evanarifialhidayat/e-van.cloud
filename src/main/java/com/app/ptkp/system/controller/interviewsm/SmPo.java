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

import com.app.ptkp.system.controller.interviewsm.model.SmModelPo;
import com.app.ptkp.system.controller.interviewsm.model.SmModelPoDetail;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoPo;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoPoDetail;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesPo;
import com.app.ptkp.system.controller.interviewsm.services.SmServicesPoDetail;
import com.app.ptkp.system.util.ParamPath;

@Controller
@RequestMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_INBOUND)
public class SmPo {
	
	    @Autowired	private SmRepoPo smRepoPo;	 
	    @Autowired	private SmRepoPoDetail smRepoPoDetail;	 
	    @Autowired  private SmServicesPo smServicesPo;
	    @Autowired  private SmServicesPoDetail smServicesPoDetail;
	    
	
	    @GetMapping(value = "")
	    public String home(Model model){
	    	
	    	//SmModelPoDetail podetail = smRepoPoDetail.findBySqty(Integer.parseInt("0"));
	    	
	    	return "sm_po";
	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_DASHBOARD)
	    public String dashboard(Model model){
	    	
	    	return "sm_dashboard";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_INBOUND_PO)
	    public String form(Model model){
	    	
	    	return "sm_po";
	    }
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_INBOUND_PO_SAVE)
		public String formsave(@ModelAttribute("name") SmModelPo forminput, Model model, HttpSession session, HttpServletRequest request) {
	    	smServicesPo.saveData(forminput);
	        return "redirect:";
	    }
	    
	    @PostMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_INBOUND_PO_UPDATE)
  		public String formupdate(@ModelAttribute("name") SmModelPo forminput, Model model, HttpSession session, HttpServletRequest request) {
  	    	smServicesPo.updateData(forminput);
  	        return "redirect:";
  	    }
	    
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_INBOUND_PO_LIST)
	    public String formlist(Model model){
	    	JSONArray arr = new JSONArray();
	    	SmModelPo obj = new SmModelPo();
	        String ardata = new String();
	        List listParam = (List<SmModelPo>) smRepoPo.findAll();
	   		if(listParam.size() > 0) {
	   			for(int i=0; i<listParam.size(); i++) {
	   				obj = (SmModelPo) listParam.get(i);
	   			 }
	   		}
            model.addAttribute("arr",listParam);
	            
	    	return "sm_po_list";
	    }
	    @GetMapping(value = ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_INBOUND_PO_DELETE)
	    public String delete(Model model, @RequestParam String id){
	    	SmModelPo obj = new SmModelPo();
	        obj.setId_seq(Long.parseLong(id));
	        smServicesPo.deleteData(obj);
	        return "redirect:/sm/inbound"+ParamPath.PATH_WEB_INTERVIEW_SURYA_MADISTRINDO_INBOUND_PO_LIST;
	    }

}
