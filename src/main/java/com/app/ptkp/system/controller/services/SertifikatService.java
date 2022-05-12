package com.app.ptkp.system.controller.services;

import java.util.List;

import com.app.ptkp.system.controller.model.Sertifikat;

public interface SertifikatService {
    List findAllData();
	Sertifikat saveData(Sertifikat gate);
	Sertifikat updateData(Sertifikat gate);
	Sertifikat deleteData(Sertifikat gate);
}
