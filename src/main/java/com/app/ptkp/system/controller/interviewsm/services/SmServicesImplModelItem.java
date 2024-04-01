package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ptkp.system.controller.interviewsm.model.SmModelItem;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoItem;


@Service
@Transactional
public class SmServicesImplModelItem implements SmServicesModelItem{
	
	@Autowired SmRepoItem smRepoItem;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) smRepoItem.findAll();
	}

	@Override
	public SmModelItem saveData(SmModelItem in) {
		SmModelItem obj = smRepoItem.save(in);	
		return obj;
	}

	@Override
	public SmModelItem updateData(SmModelItem in) {
		SmModelItem obj = em.find(SmModelItem.class,in.id_seq); 
		if(obj != null) {
			obj = in;
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public SmModelItem deleteData(SmModelItem in) {
		SmModelItem obj = em.find(SmModelItem.class,in.id_seq); 
		if(obj != null) {
			em.remove(obj);
		}
		return obj;
	}

}
