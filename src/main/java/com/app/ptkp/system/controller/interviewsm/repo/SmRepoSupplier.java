package com.app.ptkp.system.controller.interviewsm.repo;


import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import com.app.ptkp.system.controller.interviewsm.model.SmModelSupplier;


@Repository
public interface SmRepoSupplier extends DataTablesRepository<SmModelSupplier, Long> {
	
}
