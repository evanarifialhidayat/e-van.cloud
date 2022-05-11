package com.app.ptkp.system.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;

import com.app.ptkp.system.controller.model.QrCodeRespon;
import com.app.ptkp.system.util.QRCodeGenerator;
import com.google.zxing.WriterException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
    @GetMapping(value = "/")
    public String index(Model model){
       JSONArray arr = new JSONArray();
       arr.add(new QrCodeRespon(1, "as", "sss", "sjudul", "slembaga", new Date(), "ssertifikat1"));
       arr.add(new QrCodeRespon(1, "as", "sss", "sjudul", "slembaga", new Date(), "ssertifikat2"));
      
System.out.println("============"+arr);


      
        String medium="https://rahul2602199sss9.medium.com/";    	 
         Resource resource = new ClassPathResource("QRCode.png");
         byte[] image = new byte[0];
         try {
             image = QRCodeGenerator.getQRCodeImage(medium,250,250);
         } catch (WriterException | IOException e) {
             e.printStackTrace();
         }
         
         String qrcode = "data:image/png;base64,"+Base64.getEncoder().encodeToString(image);
         model.addAttribute("qrcode",qrcode);
        return "index";
    }

    @GetMapping(value = "/login")
    public String login(Model model){
        return "login";
    }

    @GetMapping(value = "/panduan")
    public String panduan(Model model){
        return "panduan";
    }
    
}
