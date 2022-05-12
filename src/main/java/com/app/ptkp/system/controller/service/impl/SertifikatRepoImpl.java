package com.app.ptkp.system.controller.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.app.ptkp.system.controller.model.Sertifikat;
import com.app.ptkp.system.controller.repo.SertifikatRepo;
import com.app.ptkp.system.controller.services.SertifikatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SertifikatRepoImpl implements SertifikatService{
	
	@Autowired SertifikatRepo sertifikatRepo;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) sertifikatRepo.findAll();
	}

	@Override
	public Sertifikat saveData(Sertifikat gate) {
//		Optional<t_trx_gate> objGet = t_trx_gateRepo.findById(gate.id_seq); 
        Sertifikat obj = sertifikatRepo.save(gate);	
		return obj;
	}

	@Override
	public Sertifikat updateData(Sertifikat gate) {
		Sertifikat obj = em.find(Sertifikat.class,gate.id_seq); 
		if(obj != null) {
//			devinisikan data apa aja yg mau di update dari gate
//			obj.setDelete(Long.valueOf("1"));
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public Sertifikat deleteData(Sertifikat gate) {
		Sertifikat obj = em.find(Sertifikat.class,gate.id_seq); 
		if(obj != null) {
//			devinisikan data apa aja yg mau di delete dari gate
//			obj.setDelete(Long.valueOf("1"));
			em.remove(obj);
		}
		return obj;
	}

}
