package com.springpractice.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springpractice.courses.bean.Course;

@RestController
public class CoursesController {

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		List<Course> list = Arrays.asList(new Course(1, "JAVA8", "SunMicroSystem"));
		System.out.println(list);
		return list;

	}
	
	
	@GetMapping("/courses/2")
	public List<Course> getAllCourses1() {
		List<Course> list = Arrays.asList(new Course(2, "JAVA", "SunMicroSystem"));
		System.out.println(list);
		return list;

	}

}
