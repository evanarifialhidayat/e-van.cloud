package com.app.ptkp.system.controller.services;

import java.util.List;

import com.app.ptkp.system.controller.model.UserLogin;


public interface UserLoginService {
    List findAllData();
    UserLogin saveData(UserLogin gate);
    UserLogin updateData(UserLogin gate);
    UserLogin deleteData(UserLogin gate);
}
