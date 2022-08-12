package com.projectmodel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projectmodel.bean.School;
import com.projectmodel.repository.SchoolRepository;

public class SchoolService {
 
	@Autowired
	public SchoolRepository schoolRepository;
	
	public List<School> getAllSchool(){
		
		List<School>school= new ArrayList<>();
		schoolRepository.findAll().forEach(school::add);
		return school;
	}

	public void addschool(School school) {
		schoolRepository.save(school);
		
	}
	
	
}
