package com.app.ptkp.system.controller.interview.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ptkp.system.controller.interview.model.ModelFormInput;
import com.app.ptkp.system.controller.interview.repo.RepoFormInput;

@Service
@Transactional
public class ServicesImplFormInput implements ServicesFormInput{
	
	@Autowired RepoFormInput repoFormInput;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) repoFormInput.findAll();
	}

	@Override
	public ModelFormInput saveData(ModelFormInput in) {
		ModelFormInput obj = repoFormInput.save(in);	
		return obj;
	}

	@Override
	public ModelFormInput updateData(ModelFormInput in) {
		ModelFormInput obj = em.find(ModelFormInput.class,in.id_seq); 
		if(obj != null) {
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public ModelFormInput deleteData(ModelFormInput in) {
		ModelFormInput obj = em.find(ModelFormInput.class,in.id_seq); 
		if(obj != null) {
			em.remove(obj);
		}
		return obj;
	}

}
