package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;

import com.app.ptkp.system.controller.interviewsm.model.SmModelPo;




public interface SmServicesPo {
    List findAllData();
    SmModelPo saveData(SmModelPo in);
    SmModelPo updateData(SmModelPo in);
    SmModelPo deleteData(SmModelPo in);
}
