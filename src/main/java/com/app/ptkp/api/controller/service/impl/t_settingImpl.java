package com.app.ptkp.api.controller.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.app.ptkp.api.controller.model.t_setting;
import com.app.ptkp.api.controller.repo.t_settingRepo;
import com.app.ptkp.api.controller.services.t_settingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class t_settingImpl implements t_settingService{
	
	@Autowired t_settingRepo t_trx_gateRepo;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) t_trx_gateRepo.findAll();
	}

	@Override
	public t_setting saveData(t_setting gate) {
//		Optional<t_trx_gate> objGet = t_trx_gateRepo.findById(gate.id_seq); 
		t_setting obj = t_trx_gateRepo.save(gate);	
		return obj;
	}

	@Override
	public t_setting updateData(t_setting gate) {
		t_setting obj = em.find(t_setting.class,gate.id_seq); 
		if(obj != null) {
//			devinisikan data apa aja yg mau di update dari gate
//			obj.setDelete(Long.valueOf("1"));
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public t_setting deleteData(t_setting gate) {
		t_setting obj = em.find(t_setting.class,gate.id_seq); 
		if(obj != null) {
//			devinisikan data apa aja yg mau di delete dari gate
//			obj.setDelete(Long.valueOf("1"));
			em.remove(obj);
		}
		return obj;
	}

}
