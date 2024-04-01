package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;

import com.app.ptkp.system.controller.interviewsm.model.SmModelCustommer;





public interface SmServicesCustommer {
    List findAllData();
    SmModelCustommer saveData(SmModelCustommer in);
    SmModelCustommer updateData(SmModelCustommer in);
    SmModelCustommer deleteData(SmModelCustommer in);
}
