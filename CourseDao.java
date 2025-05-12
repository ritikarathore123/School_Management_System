package com.infobeans.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.infobeans.Model.course;

//import com.infobeans.Model.Teacher;

public class CourseDao {
	private static final String URL="jdbc:mysql://localhost:3306/university";
	private static final String USER="root";
	private static final String Password="Rittu@123";
	// method to establish connection
	private Connection getConnection() throws Exception{
		return DriverManager.getConnection(URL,USER,Password);
	}
	// method to insert data
	public void insertCourse(course course1) throws Exception{
	String sql ="insert into course (course_id,course_name) values (?,?)";
	Connection conn=getConnection();
	PreparedStatement pstm=conn.prepareStatement(sql);
	pstm.setLong(1,course1.getCourse_id());
	pstm.setString(2,course1.getCourse_name());
		}
	// method to retrive all Student
	public List<course> getAllcourses() throws Exception{
	List <course> courses=new ArrayList<>();
		String sql="select*from course";
		Connection conn=getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			course course1=new course(
			rs.getLong("course_id"),
			rs.getString("course_name")
				);
			courses.add(course1);
		}
		return courses;	
	}
	
}
