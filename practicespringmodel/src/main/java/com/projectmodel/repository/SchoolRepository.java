package com.projectmodel.repository;

import org.springframework.data.repository.CrudRepository;

import com.projectmodel.bean.School;

public interface SchoolRepository extends CrudRepository<School,Integer> {
	
   
}
