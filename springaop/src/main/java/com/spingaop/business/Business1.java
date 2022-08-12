package com.spingaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spingaop.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;
	
	public String calculatesomething() {
		
		return dao1.retrievesomething();
	}
	
}
