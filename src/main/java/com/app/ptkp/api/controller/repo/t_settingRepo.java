package com.app.ptkp.api.controller.repo;
import com.app.ptkp.api.controller.model.t_setting;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface t_settingRepo extends DataTablesRepository<t_setting, Long> {

}
