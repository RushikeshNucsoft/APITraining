package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourseById(long id);

	public Course addCourse(Course course);
	
}
