package com.app.ptkp.system.controller.interviewsm.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ptkp.system.controller.interviewsm.model.SmModelItem;
import com.app.ptkp.system.controller.interviewsm.model.SmModelPo;
import com.app.ptkp.system.controller.interviewsm.model.SmModelSupplier;
import com.app.ptkp.system.controller.interviewsm.repo.SmRepoPo;



@Service
@Transactional
public class SmServicesImplPoDetail implements SmServicesPo{
	
	@Autowired SmRepoPo smRepoPo;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) smRepoPo.findAll();
	}

	@Override
	public SmModelPo saveData(SmModelPo in) {
		
		SmModelSupplier obj_item = em.find(SmModelSupplier.class,in.getSmmodelsupplier().id_seq); 
		SmModelPo obj = null;
		
		if(obj_item != null) {
			in.setSmmodelsupplier(obj_item);
			obj = smRepoPo.save(in);	
		}
		
		
		return obj;
	}

	@Override
	public SmModelPo updateData(SmModelPo in) {
		SmModelPo obj = em.find(SmModelPo.class,in.id_seq); 
		if(obj != null) {
			obj = in;
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public SmModelPo deleteData(SmModelPo in) {
		SmModelPo obj = em.find(SmModelPo.class,in.id_seq); 
		if(obj != null) {
			em.remove(obj);
		}
		return obj;
	}

}
