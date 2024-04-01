package com.app.ptkp.system.controller.interview.repo;


import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import com.app.ptkp.system.controller.interview.model.ModelFormInput;

@Repository
public interface RepoFormInput extends DataTablesRepository<ModelFormInput, Long> {
	
}
