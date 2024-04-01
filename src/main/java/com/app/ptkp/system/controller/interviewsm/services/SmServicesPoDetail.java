package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;

import com.app.ptkp.system.controller.interviewsm.model.SmModelPoDetail;



public interface SmServicesPoDetail {
    List findAllData();
    SmModelPoDetail saveData(SmModelPoDetail in);
    SmModelPoDetail updateData(SmModelPoDetail in);
    SmModelPoDetail deleteData(SmModelPoDetail in);
}
