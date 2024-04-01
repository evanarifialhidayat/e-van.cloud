package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;

import com.app.ptkp.system.controller.interviewsm.model.SmModelUser;



public interface SmServicesUser {
    List findAllData();
    SmModelUser saveData(SmModelUser in);
    SmModelUser updateData(SmModelUser in);
    SmModelUser deleteData(SmModelUser in);
}
