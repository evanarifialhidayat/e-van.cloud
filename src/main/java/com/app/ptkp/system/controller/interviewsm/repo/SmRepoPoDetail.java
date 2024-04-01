package com.app.ptkp.system.controller.interviewsm.repo;


import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import com.app.ptkp.system.controller.interviewsm.model.SmModelPoDetail;




@Repository
public interface SmRepoPoDetail extends DataTablesRepository<SmModelPoDetail, Long> {
	
	SmModelPoDetail findBySqty(Integer sqty);
	
}
