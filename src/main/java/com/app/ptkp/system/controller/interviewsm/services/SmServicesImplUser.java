package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ptkp.system.controller.interviewsm.model.SmModelUser;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoUser;


@Service
@Transactional
public class SmServicesImplUser implements SmServicesUser{
	
	@Autowired SmRepoUser smRepoUser;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) smRepoUser.findAll();
	}

	@Override
	public SmModelUser saveData(SmModelUser in) {
		SmModelUser obj = smRepoUser.save(in);	
		return obj;
	}

	@Override
	public SmModelUser updateData(SmModelUser in) {
		SmModelUser obj = em.find(SmModelUser.class,in.id_seq); 
		if(obj != null) {
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public SmModelUser deleteData(SmModelUser in) {
		SmModelUser obj = em.find(SmModelUser.class,in.id_seq); 
		if(obj != null) {
			em.remove(obj);
		}
		return obj;
	}

}
