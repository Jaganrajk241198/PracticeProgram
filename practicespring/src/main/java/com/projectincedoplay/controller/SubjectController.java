package com.projectincedoplay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projectincedoplay.bean.Subject;
import com.projectincedoplay.service.SubjectService;

@RestController
public class SubjectController {
	
    @Autowired
	public SubjectService subjectService;
	
    @RequestMapping("/subjects")
	public List<Subject>getAllsubjects(){
		 
	return subjectService.getAllSubjects();
	}
    
    @RequestMapping(method = RequestMethod.POST, value="/Subjects")
    public void addsubject(@RequestBody Subject subject) {
      subjectService.addsubject(subject);    	
    	}
    
    @RequestMapping(method = RequestMethod.PUT, value="/Subjects/{id}")
    public void updatesubject(@PathVariable String id ,@RequestBody Subject subject) {
      subjectService.updatesubject( id ,subject);    	
    	}
    
          	
}
