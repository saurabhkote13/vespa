package com.assimilate.vespa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assimilate.vespa.dao.VespaDao;
import com.assimilate.vespa.model.Vespa;

@Component
public class VespaServiceImpl implements VespaService{
	@Autowired
	VespaDao vespadao;

	@Override
	public int addTestRide(Vespa vespa) {
		int result=vespadao.addTestRide(vespa);
		return result;
	}

}
