package com.app.ptkp.system.controller.interviewsm.repo;


import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import com.app.ptkp.system.controller.interviewsm.model.SmModelUser;

@Repository
public interface SmRepoUser extends DataTablesRepository<SmModelUser, Long> {
	
}
