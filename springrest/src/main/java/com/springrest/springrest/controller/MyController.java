package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private CourseDao courseDao;
	
	@GetMapping("/home")
	public String home ()
	{
		return "This is a home page";
	}
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseDao.findAll();
		
		//return this.courseService.getCourses();
		
	
	}
	
	@GetMapping("/course/{id}")
	public Course getCourseById(@PathVariable long id)
	{
		
		return this.courseService.getCourseById(id);
		
	}
	
	@PostMapping(path="/addCourse")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}

}
