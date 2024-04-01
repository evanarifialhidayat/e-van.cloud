package com.app.ptkp.system.controller.interviewsm.repo;


import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.ptkp.system.controller.interviewsm.model.SmModelItem;

@Repository
public interface SmRepoItem extends DataTablesRepository<SmModelItem, Long> {
	
	public SmModelItem findByScode(String scode);
	@Query("SELECT a "
			+ " FROM  SmModelItem a "
			+ " where a.scode = ?1"
			+ " order by a.scode asc  ")
	public SmModelItem findScode(String scode);
	
	
	@Query(
			  value = "SELECT * FROM smitem u WHERE u.scode = ?1", 
			  nativeQuery = true
			  )
	SmModelItem findScodeNative(String status);
	
	
	
//	@Query("SELECT a "
//			+ " FROM SmModelItem a "
//			+ " LEFT JOIN a.roomconstrainuser b " 
//			+ " where a.userid = ?#{#param.userid} "
//			+ " and a.delete=0 "
//			+ " order by a.createupdate desc , a.roomname asc  ")
	
}
