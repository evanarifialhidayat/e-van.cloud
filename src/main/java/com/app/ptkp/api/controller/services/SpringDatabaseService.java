package com.app.ptkp.api.controller.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class SpringDatabaseService {
    public SpringDatabaseService(){}

    public String getSpringDatabase(HttpSession httpSession, HttpServletRequest request, String param){
        String obj = (String) request.getSession().getAttribute(param);
        return obj;
    }

    public void setSpringDatabase(HttpSession httpSession, HttpServletRequest request, String param){
        request.getSession().setAttribute(param, param);
    }
}
