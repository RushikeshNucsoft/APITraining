package com.springrest.springrest.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	
// step-1	List<Course> list;
	
	public CourseServiceImpl()
	{
//		/* step-1
//		 * list = new ArrayList<>(); list.add(new Course(145,"java course",
//		 * "this is java course")); list.add(new Course(132,"spring boot",
//		 * "this is spring boot course"));
//		 */
	}

	@Override
	public List<Course> getCourses() {
		
		
	
	//step-1	return list; 
		
	
		//step-2
		return  courseDao.findAll();
	}
	
	
	
	@Override
	public Course getCourseById(long id) {
//		
//		/* step-1
//		 * Course c = null; for(Course course:list) { if(course.getId() == id) { c =
//		 * course; }
//		 * 
//		 * 
//		 * }
//		 * 
//		 * return c;
//		 */
		
		//step- 2
		return courseDao.getOne(id);
	}
//
	@Override
	public Course addCourse(Course course) {
//		
//	//step-1	list.add(course);
		
//		
//		return course;
		
		
		return courseDao.save(course);
	}

	
	
	
}
