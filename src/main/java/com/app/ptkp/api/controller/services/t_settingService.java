package com.app.ptkp.api.controller.services;

import java.util.List;

import com.app.ptkp.api.controller.model.t_setting;


public interface t_settingService {
	List findAllData();
	t_setting saveData(t_setting param);
	t_setting updateData(t_setting param);
	t_setting deleteData(t_setting param);
}
