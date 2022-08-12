package com.projectincedoplay.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectincedoplay.bean.Subject;
import com.projectincedoplay.repository.SubjectRepository;

@Service
public class SubjectService {
   
	@Autowired
	public SubjectRepository subjectRepository;
	
	public List<Subject> getAllSubjects(){
		
		List<Subject>subjects= new ArrayList<>();
		subjectRepository.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addsubject(Subject subject) {
		  subjectRepository.save(subject);
		
	}

	public void updatesubject(String id, Subject subject) {
		subjectRepository.save(subject);
		
	}
	
	
	
	
}
