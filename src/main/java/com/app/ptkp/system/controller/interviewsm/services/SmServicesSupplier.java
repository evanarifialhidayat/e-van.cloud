package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;

import com.app.ptkp.system.controller.interviewsm.model.SmModelSupplier;




public interface SmServicesSupplier {
    List findAllData();
    SmModelSupplier saveData(SmModelSupplier in);
    SmModelSupplier updateData(SmModelSupplier in);
    SmModelSupplier deleteData(SmModelSupplier in);
}
