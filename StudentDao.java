package com.infobeans.DAO;
import java.util.*;
import java.util.List;
import java.sql.*;
import com.infobeans.Model.*;
public class StudentDao {
private static final String URL="jdbc:mysql://localhost:3306/university";
private static final String USER="root";
private static final String Password="Rittu@123";
// method to establish connection
private Connection getConnection() throws Exception{
	return DriverManager.getConnection(URL,USER,Password);
}
// method to insert data
public void insertStudent(Student student1) throws Exception{
String sql ="insert into student (name,fname,DOB,Address,phone,email,Class1,aadhar,rollno,course,tid,course_id) values (?,?,?,?,?,?,?,?,?,?,?,?)";
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement(sql);
pstm.setString(1,student1.getName());
pstm.setString(2,student1.getFname());
pstm.setString(3,student1.getDOB());
pstm.setString(4,student1.getAddress());
pstm.setLong(5,student1.getPhone());
pstm.setString(6,student1.getEmail());
pstm.setString(7,student1.getClass1());
pstm.setLong(8,student1.getAadhar());
pstm.setLong(9,student1.getRollno());
pstm.setString(10,student1.getCourse());
pstm.setLong(11,student1.getTid());
pstm.setLong(12,student1.getCourse_id());

pstm.executeUpdate();
System.out.println("**************added  successfully***************");
}
//method to insert data
public void SignUpStudent1(Student student2) throws Exception{
String sql ="insert into student (name,fname,DOB,Address,phone,email,Class1,aadhar,rollno,course,tid,course_id) values (?,?,?,?,?,?,?,?,?,?,?,?)";
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement(sql);
pstm.setString(1,student2.getName());
pstm.setString(2,student2.getFname());
pstm.setString(3,student2.getDOB());
pstm.setString(4,student2.getAddress());
pstm.setLong(5,student2.getPhone());
pstm.setString(6,student2.getEmail());
pstm.setString(7,student2.getClass1());
pstm.setLong(8,student2.getAadhar());
pstm.setLong(9,student2.getRollno());
pstm.setString(10,student2.getCourse());
pstm.setLong(11,student2.getTid());
pstm.setLong(12,student2.getCourse_id());
pstm.executeUpdate();
System.out.println("**************sign  up successfully***************");
}
// method to login student
public List<Student> Login(String name0,long rollno0) throws Exception{ 
	Connection conn=getConnection();
	PreparedStatement pstm=conn.prepareStatement("select*from student");
	//PreparedStatement pstm=conn.prepareStatement("select*from student where name=? or rollno=?");
	//pstm.setString(1,name0);
	//pstm.setLong(2,rollno0);
	ResultSet rs=pstm.executeQuery();
	List<Student>l=new ArrayList<>();
	//Student student1=null;
	while(rs.next()) {
		Student  student1=new Student(
		rs.getString("name"),
		rs.getString("fname"),
		rs.getString("DOB"),
		rs.getString("Address"),
		rs.getLong("phone"),
		rs.getString("email"),
		rs.getString("Class1"),
		rs.getLong("aadhar"),
		rs.getLong("rollno"),
		rs.getString("course"),
		rs.getLong("tid"),
		rs.getLong("course_id")
		);
		l.add(student1);
				System.out.println("*********login Successfully***********");
	}
	return l;	
}
//method to UpdateStudentBasedonRollno data
public void UpdateStudentNameBasedonRollno(String name1,long rollno1) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("update student set name=? where rollno=?");
pstm.setString(1,name1);
pstm.setLong(2,rollno1);
pstm.executeUpdate();
System.out.println("***********update  successfully***********");
}
//method to UpdateStudentCourseBasedonName data
public void UpdateStudentCourseBasedonName(String course1,String name2) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("update student set course=? where name=?");
pstm.setString(1,course1);
pstm.setString(2,name2);
pstm.executeUpdate();
System.out.println("**************update  successfully************");
}
//method to UpdateStudentAddressBasedonTid data
public void UpdateStudentAddressBasedonTid(String address1 ,long tid1) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("update student set address=? where tid=?");
pstm.setString(1,address1);
pstm.setLong(2,tid1);
pstm.executeUpdate();
System.out.println("**************update  successfully****************");
}

//method to UpdateStudentClassBasedonEmail data
public void UpdateStudentClassBasedonEmail(String class1,String email1) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("update student set Class1=? where email=?");
pstm.setString(1,class1);
pstm.setString(2,email1);
pstm.executeUpdate();
System.out.println("*************update  successfully*************");
}
//method to DeleteStudentBasedOnRollno
public void DeleteStudentBasedOnRollno(long rollno1) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("delete from student where rollno=?");
pstm.setLong(1,rollno1);
System.out.println("****************delete successfully***********");
}
//method to DeleteStudentBasedOnName
public void DeleteStudentBasedOnName(String sname) throws Exception{
//String sql ="delete from student where name=?";
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("delete from student where name=?");
pstm.setString(1,sname);
pstm.executeUpdate();
System.out.println("*****************delete successfully****************");
}
//method to DeleteStudentBasedOnClass
public void DeleteStudentBasedOnClass(String class1) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("delete from student where Class1=?");
pstm.setString(1,class1);
pstm.executeUpdate();
System.out.println("**************delete successfully****************");
}
//method to DeleteStudentBasedOnCourse_id
public void DeleteStudentBasedOnCourse_id(long course_id1) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("delete from student where course_id=?");
pstm.setLong(1,course_id1);
pstm.executeUpdate();
System.out.println("***********delete successfully**************");
}
//method to DeleteStudentBasedOnAddress
public void DeleteStudentBasedOnAddress(String address) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("delete from student where Address=?");
pstm.setString(1,address);
pstm.executeUpdate();
System.out.println("**************delete successfully*************");
}
// search block
//{
//method to searchbAddress
public Student SearchByAddress(String address2) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("select*from student where address=?");
pstm.setString(1,address2);
ResultSet rs=pstm.executeQuery();
Student s= null;
while(rs.next()) {
  s=new Student(rs.getString("name"),
	rs.getString("fname"),
	rs.getString("DOB"),
	rs.getString("Address"),
	rs.getLong("phone"),
	rs.getString("email"),
	rs.getString("Class1"),
	rs.getLong("aadhar"),
	rs.getLong("rollno"),
	rs.getString("course"),
	rs.getLong("tid"),
	rs.getLong("course_id")
	);
	System.out.println("*********Data search Successfully***********");

//return s;
}
return s;
}
//method to searchbyname
public Student SearchByName(String name3) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("select*from student where name=?");
pstm.setString(1,name3);
ResultSet rs=pstm.executeQuery();
Student s= null;
while(rs.next()) {
s=new Student(rs.getString("name"),
	rs.getString("fname"),
	rs.getString("DOB"),
	rs.getString("Address"),
	rs.getLong("phone"),
	rs.getString("email"),
	rs.getString("Class1"),
	rs.getLong("aadhar"),
	rs.getLong("rollno"),
	rs.getString("course"),
	rs.getLong("tid"),
	rs.getLong("course_id")
	);
	System.out.println("*********Data search Successfully***********");
}
return s;	

}
//method to searchbytid
public Student SearchByTid(long tid3) throws Exception{
Connection conn=getConnection();
PreparedStatement pstm=conn.prepareStatement("select*from student where tid=?");
pstm.setLong(1,tid3);
ResultSet rs=pstm.executeQuery();
Student s= null;
while(rs.next()) {
s=new Student(rs.getString("name"),
	rs.getString("fname"),
	rs.getString("DOB"),
	rs.getString("Address"),
	rs.getLong("phone"),
	rs.getString("email"),
	rs.getString("Class1"),
	rs.getLong("aadhar"),
	rs.getLong("rollno"),
	rs.getString("course"),
	rs.getLong("tid"),
	rs.getLong("course_id")
	);
	System.out.println("*********Data search Successfully***********");
}
return s;	
}

// method to retrive all Student
public List<Student> getAllStudents() throws Exception{
List <Student> Students=new ArrayList<>();
	String sql="select*from student"; 
	Connection conn=getConnection();
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next()) {
		Student student1=new Student(
		rs.getString("name"),
		rs.getString("fname"),
		rs.getString("DOB"),
		rs.getString("Address"),
		rs.getLong("phone"),
		rs.getString("email"),
		rs.getString("Class1"),
		rs.getLong("aadhar"),
		rs.getLong("rollno"),
		rs.getString("course"),
		rs.getLong("tid"),
		rs.getLong("course_id")

		);
		Students.add(student1);
	}
		System.out.println("*********Data Retrieve Successfully***********");
	
	return Students;	
}
}
