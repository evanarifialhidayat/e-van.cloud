package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;

import com.app.ptkp.system.controller.interviewsm.model.SmModelItem;



public interface SmServicesModelItem {
    List findAllData();
    SmModelItem saveData(SmModelItem in);
    SmModelItem updateData(SmModelItem in);
    SmModelItem deleteData(SmModelItem in);
}
