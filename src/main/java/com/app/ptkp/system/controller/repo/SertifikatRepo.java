package com.app.ptkp.system.controller.repo;

import com.app.ptkp.system.controller.model.Sertifikat;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SertifikatRepo extends DataTablesRepository<Sertifikat, Long> {
	
}
