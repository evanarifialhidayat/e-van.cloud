package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ptkp.system.controller.interviewsm.model.SmModelPo;
import com.app.ptkp.system.controller.interviewsm.model.SmModelPoDetail;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoPoDetail;



@Service
@Transactional
public class SmServicesImplPo implements SmServicesPoDetail{
	
	@Autowired SmRepoPoDetail smRepoPoDetail;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) smRepoPoDetail.findAll();
	}

	@Override
	public SmModelPoDetail saveData(SmModelPoDetail in) {
		
		SmModelPo obj_item = em.find(SmModelPo.class,in.getSpoid().id_seq); 
		SmModelPoDetail obj = null;
		
		if(obj_item != null) {
			in.setSpoid(obj_item);
			obj = smRepoPoDetail.save(in);	
		}
		
		
		return obj;
	}

	@Override
	public SmModelPoDetail updateData(SmModelPoDetail in) {
		SmModelPoDetail obj = em.find(SmModelPoDetail.class,in.id_seq); 
		if(obj != null) {
			obj = in;
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public SmModelPoDetail deleteData(SmModelPoDetail in) {
		SmModelPoDetail obj = em.find(SmModelPoDetail.class,in.id_seq); 
		if(obj != null) {
			em.remove(obj);
		}
		return obj;
	}

}
