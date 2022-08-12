package com.spingaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spingaop.data.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;
	
	public String calculatesomething() {
		
		return dao2.retrievesomething();
	}
	
}
