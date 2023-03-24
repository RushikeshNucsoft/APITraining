package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<Course> list;
	
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(145,"java course", "this is java course"));
		list.add(new Course(132,"spring boot", "this is spring boot course"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourseById(long id) {
		
		Course c = null;
		for(Course course:list)
		{
			if(course.getId() == id)
			{
				c = course;
			}
			
			
		}
			
			
		
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
		
		return course;
	}

	
	
	
}
