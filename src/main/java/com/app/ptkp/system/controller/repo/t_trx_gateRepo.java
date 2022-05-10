package com.app.ptkp.system.controller.repo;
import com.app.ptkp.system.controller.constanta.Param;
import com.app.ptkp.system.controller.model.t_trx_gate;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface t_trx_gateRepo extends DataTablesRepository<t_trx_gate, Long> {
	
}
