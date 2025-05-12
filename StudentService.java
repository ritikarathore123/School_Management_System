package com.infobeans.Service;
import com.infobeans.Model.*;
import com.infobeans.DAO.*;
import java.sql.*;
import java.util.*;
public class StudentService {
	private StudentDao studentDao;
	public StudentService() {
				// constructor
				this.studentDao=new StudentDao();
	}
	// insert student
	public void SignUpStudent(Student student2) throws Exception{
		studentDao.SignUpStudent1(student2);
	}
	//  insert student
	public void addStudent(Student student1) throws Exception{
		studentDao.insertStudent(student1);
	}

	// fetch all student
	public List <Student> fetchAllStudents() throws Exception{
		return studentDao.getAllStudents();
	}
	// update block
	//{
	public void UpdateStudentNamebyRollno(String name1,long rollno1) throws Exception{
		studentDao.UpdateStudentNameBasedonRollno(name1,rollno1);
	}
	public void UpdateStudentCoursebyName(String course1,String name2) throws Exception{
		studentDao.UpdateStudentCourseBasedonName(course1,name2);
	}
	public void UpdateStudentAddressbyTid(String address1,long tid1) throws Exception{
		studentDao.UpdateStudentAddressBasedonTid(address1,tid1);
	}
	public void UpdateStudentClassbyEmail(String class1,String email1) throws Exception{
		studentDao.UpdateStudentClassBasedonEmail(class1,email1);
	}
//}
	//-------------
	//delete block
	//{
	public void deleteStudentbyRollno(long rollno1) throws Exception{
		studentDao.DeleteStudentBasedOnRollno(rollno1);
	}
	public void deleteStudentbyName(String sname) throws Exception{
		studentDao.DeleteStudentBasedOnName(sname);
	}
	public void deleteStudentbyClass(String class1) throws Exception{
		studentDao.DeleteStudentBasedOnClass(class1);
	}
	public void deleteStudentbycourse_id(long course_id1) throws Exception{
		studentDao.DeleteStudentBasedOnCourse_id(course_id1);
	}
	public void deleteStudentbyAddress(String address) throws Exception{
		studentDao.DeleteStudentBasedOnAddress(address);
	}
	//}
	// search block
	public Student SearchByAddress1(String address2) throws Exception{
		return studentDao.SearchByAddress(address2);
	}
	public Student SearchByName1(String name3) throws Exception{
		return studentDao.SearchByName(name3);
	}
	public Student SearchByTid1(long tid3) throws Exception{
		return studentDao.SearchByTid(tid3);
	}
	// login
	public List<Student> Login_service(String name0,long rollno0)throws Exception{
		return studentDao.Login(name0,rollno0);			
	}
	}

