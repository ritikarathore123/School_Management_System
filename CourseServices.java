package com.infobeans.Service;

import java.util.List;

import com.infobeans.DAO.CourseDao;
import com.infobeans.Model.course;

public class CourseServices {
	private CourseDao courseDao;
	public CourseServices() {
				// constructor
				this.courseDao=new CourseDao();
	}
	// insert student
	public void addCourse(course course1) throws Exception{
		courseDao.insertCourse(course1);
	}
	// fetch all sudent
	public List <course> fetcAllcourses() throws Exception{
		return courseDao.getAllcourses();
		
	}


}

