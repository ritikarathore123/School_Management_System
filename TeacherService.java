package com.infobeans.Service;

import java.util.*;
import java.sql.*;
import com.infobeans.DAO.*;
import com.infobeans.Model.*;

public class TeacherService {
	private TeacherDao teacherDao;
	public TeacherService() {
				// constructor
				this.teacherDao=new TeacherDao();
	}
	// insert student
	public void addTeacher(Teacher teacher) throws Exception{
		teacherDao.insertTeacher(teacher);
	}
	// fetch all sudent
	public List <Teacher> fetcAllTeachers() throws Exception{
		return teacherDao.getAllTeachers();
		
	}


}
