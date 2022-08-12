package com.projectmodel.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.projectmodel.bean.School;
import com.projectmodel.service.SchoolService;

@RestController
public class SchoolController {
 
	@Autowired
	public SchoolService schoolService;
	
	@RequestMapping("/schools")
	public List<School>getAllschool(){
		
	 return schoolService.getAllSchool();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/schools")
    public void addschool(@RequestBody School school) {
      schoolService.addschool(school);    	
    	}
}
