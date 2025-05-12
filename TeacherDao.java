package com.infobeans.DAO;
import java.util.*;
import com.infobeans.Model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class TeacherDao {
	private static final String URL="jdbc:mysql://localhost:3306/university";
	private static final String USER="root";
	private static final String Password="Rittu@123";
	// method to establish connection
	private Connection getConnection() throws Exception{
		return DriverManager.getConnection(URL,USER,Password);
	}
	// method to insert data
	public void insertTeacher(Teacher teacher) throws Exception{
	String sql ="insert into Teacher (tid,tname,salary) values (?,?,?)";
	Connection conn=getConnection();
	PreparedStatement pstm=conn.prepareStatement(sql);
	pstm.setLong(1,teacher.getTid());
	pstm.setString(2,teacher.getTname());
	pstm.setDouble(3,teacher.getSalary());
	
	}
	// method to retrive all Student
	public List<Teacher> getAllTeachers() throws Exception{
	List <Teacher> Teachers=new ArrayList<>();
		String sql="select*from Teacher";
		Connection conn=getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			Teacher teacher=new Teacher(
			rs.getLong("tid"),
			rs.getString("tname"),
			rs.getDouble("salary")
									);
			Teachers.add(teacher);
		}
		return Teachers;	
	}
	}


