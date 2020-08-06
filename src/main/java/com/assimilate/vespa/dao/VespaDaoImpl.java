package com.assimilate.vespa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.assimilate.vespa.model.Vespa;
@Component
public class VespaDaoImpl implements VespaDao{
	
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public int addTestRide(Vespa vespa) {
		int result=jdbctemplate.update("insert into vespatest(name,mobile,email,city) values(?,?,?,?)",vespa.getName(),vespa.getMobile(),vespa.getEmail(),vespa.getCity());
		return result;
	}

}
