package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ptkp.system.controller.interviewsm.model.SmModelSupplier;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoSupplier;



@Service
@Transactional
public class SmServicesImplSupplier implements SmServicesSupplier{
	
	@Autowired SmRepoSupplier smRepoSupplier;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) smRepoSupplier.findAll();
	}

	@Override
	public SmModelSupplier saveData(SmModelSupplier in) {
		SmModelSupplier obj = smRepoSupplier.save(in);	
		return obj;
	}

	@Override
	public SmModelSupplier updateData(SmModelSupplier in) {
		SmModelSupplier obj = em.find(SmModelSupplier.class,in.id_seq); 
		if(obj != null) {
			obj = in;
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public SmModelSupplier deleteData(SmModelSupplier in) {
		SmModelSupplier obj = em.find(SmModelSupplier.class,in.id_seq); 
		if(obj != null) {
			em.remove(obj);
		}
		return obj;
	}

}
