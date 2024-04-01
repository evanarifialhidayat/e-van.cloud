package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ptkp.system.controller.interviewsm.model.SmModelCustommer;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoCustommer;



@Service
@Transactional
public class SmServicesImplCustommer implements SmServicesCustommer{
	
	@Autowired SmRepoCustommer smRepoCustommer;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) smRepoCustommer.findAll();
	}

	@Override
	public SmModelCustommer saveData(SmModelCustommer in) {
		SmModelCustommer obj = smRepoCustommer.save(in);	
		return obj;
	}

	@Override
	public SmModelCustommer updateData(SmModelCustommer in) {
		SmModelCustommer obj = em.find(SmModelCustommer.class,in.id_seq); 
		if(obj != null) {
			obj = in;
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public SmModelCustommer deleteData(SmModelCustommer in) {
		SmModelCustommer obj = em.find(SmModelCustommer.class,in.id_seq); 
		if(obj != null) {
			em.remove(obj);
		}
		return obj;
	}

}
