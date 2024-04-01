package com.app.ptkp.system.controller.interview.services;

import java.util.List;

import com.app.ptkp.system.controller.interview.model.ModelFormInput;



public interface ServicesFormInput {
    List findAllData();
    ModelFormInput saveData(ModelFormInput in);
    ModelFormInput updateData(ModelFormInput in);
    ModelFormInput deleteData(ModelFormInput in);
}
