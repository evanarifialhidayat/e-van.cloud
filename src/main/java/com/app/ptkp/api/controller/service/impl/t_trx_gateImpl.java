package com.app.ptkp.api.controller.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.app.ptkp.api.controller.model.t_trx_gate;
import com.app.ptkp.api.controller.repo.t_trx_gateRepo;
import com.app.ptkp.api.controller.services.t_trx_gateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class t_trx_gateImpl implements t_trx_gateService{
	
	@Autowired t_trx_gateRepo t_trx_gateRepo;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) t_trx_gateRepo.findAll();
	}

	@Override
	public t_trx_gate saveData(t_trx_gate gate) {
//		Optional<t_trx_gate> objGet = t_trx_gateRepo.findById(gate.id_seq); 
		t_trx_gate obj = t_trx_gateRepo.save(gate);	
		return obj;
	}

	@Override
	public t_trx_gate updateData(t_trx_gate gate) {
		t_trx_gate obj = em.find(t_trx_gate.class,gate.id_seq); 
		if(obj != null) {
//			devinisikan data apa aja yg mau di update dari gate
//			obj.setDelete(Long.valueOf("1"));
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public t_trx_gate deleteData(t_trx_gate gate) {
		t_trx_gate obj = em.find(t_trx_gate.class,gate.id_seq); 
		if(obj != null) {
//			devinisikan data apa aja yg mau di delete dari gate
//			obj.setDelete(Long.valueOf("1"));
			em.remove(obj);
		}
		return obj;
	}

}
