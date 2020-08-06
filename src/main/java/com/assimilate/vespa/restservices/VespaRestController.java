package com.assimilate.vespa.restservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.vespa.model.Vespa;
import com.assimilate.vespa.services.VespaService;

@CrossOrigin
@RestController
public class VespaRestController {
	@Autowired
	private VespaService vespaservice;
	
	@PostMapping("/api/vespatest/create")
	public ResponseEntity<Object> createVespaTest(@RequestBody Vespa vespa)
	{
		try
		{
		vespaservice.addTestRide(vespa);
		if(vespa!=null)
		{
		return new ResponseEntity<Object>(vespa,HttpStatus.OK);
		}
		return new ResponseEntity<Object>("test ride creation failed",HttpStatus.NOT_FOUND);
	}catch(Exception e)
		{
		return new ResponseEntity<Object>("something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
