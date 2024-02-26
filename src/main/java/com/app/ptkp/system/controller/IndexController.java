package com.app.ptkp.system.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.app.ptkp.system.controller.model.QrCodeRespon;
import com.app.ptkp.system.controller.model.Sertifikat;
import com.app.ptkp.system.controller.repo.SertifikatRepo;
import com.app.ptkp.system.controller.services.SertifikatService;
import com.app.ptkp.system.util.QRCodeGenerator;
import com.app.ptkp.system.util.RandomCaracter;
import com.google.zxing.WriterException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @Autowired	private SertifikatRepo sertifikatRepo;	 
    @Autowired  private SertifikatService sertifikatService;
    
    @GetMapping(value = "/")
    public String indexprofile(Model model){
    	
    	return "indexprofile";
    }
	
    @GetMapping(value = "/cert")
    public String index(Model model){
     JSONArray arr = new JSONArray();
     Sertifikat obj = new Sertifikat();
     String ardata = new String();
     List listParam = (List<Sertifikat>) sertifikatRepo.findAll();
		if(listParam.size() > 0) {
			for(int i=0; i<listParam.size(); i++) {
				obj = (Sertifikat) listParam.get(i);  
                if(obj.ssertifikat == null) obj.ssertifikat = "";
                if(obj.snomor == null || "".equals(obj.snomor.trim())) obj.setSnomor(RandomCaracter.randomCaracterString(10));
                String dataQr = (obj.getSnama()+"||"+obj.getSnomor()+"||"+obj.getSlembaga()+"||"+obj.getSjudul()+"||"+obj.getStanggal());
                Resource resource = new ClassPathResource("QRCode.png");
                byte[] image = new byte[0]; 
                try {
                    image = QRCodeGenerator.getQRCodeImage(dataQr,250,250);
                } catch (WriterException | IOException e) {
                    e.printStackTrace();
                }
                obj.setSsertifikat("data:image/png;base64,"+Base64.getEncoder().encodeToString(image));
                ardata = obj.getSsertifikat();
			 }
		}
         model.addAttribute("arr",listParam);
        return "index";
    }

    @PostMapping("/cert/index-save")
	public String userSave(@ModelAttribute("name") Sertifikat userparam, Model model, HttpSession session, HttpServletRequest request) {
        if(userparam.ssertifikat == null) userparam.ssertifikat = "";
        if(userparam.snomor == null || "".equals(userparam.snomor.trim())) userparam.setSnomor(RandomCaracter.randomCaracterString(10));
        sertifikatRepo.save(userparam);
        return "redirect:/cert";
    }
    @GetMapping(value = "/delete")
    public String delete(Model model, @RequestParam String id){
        Sertifikat obj = new Sertifikat();
        obj.setId_seq(Long.parseLong(id));
        sertifikatService.deleteData(obj);
        return "redirect:/cert";
    }
    // @GetMapping(value = "/login")
    // public String login(Model model){
    //     return "login";
    // }

    // @GetMapping(value = "/panduan")
    // public String panduan(Model model){
    //     return "panduan";
    // }
    
}
