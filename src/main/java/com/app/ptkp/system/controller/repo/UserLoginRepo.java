package com.app.ptkp.system.controller.repo;


import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import com.app.ptkp.system.controller.model.UserLogin;

@Repository
public interface UserLoginRepo extends DataTablesRepository<UserLogin, Long> {
	
}
