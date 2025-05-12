
package com.infobeans.Main;

import java.util.*;
import com.infobeans.Model.*;
import com.infobeans.validation.Admin;
import com.infobeans.Service.*;
import com.infobeans.DAO.*;

public class main2 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentService studentservice = new StudentService();
		TeacherService teacherservice = new TeacherService();
		CourseServices courseservice = new CourseServices();
		boolean mainMenu = true;
		while (mainMenu) {
			System.out.println("----------press 1 for  sign up------------");
			System.out.println("----------press 2 for login as admin-------- ");
			System.out.println("----------press 3 for  exist----------");
			System.out.println("-------------------------------------------");
			int choice3 = Integer.parseInt(sc.nextLine());
			switch (choice3) {
			case 1:
				System.out.println("--------------------sign up-----------------");
				System.out.println("enter name");
				String name11 = sc.nextLine();
				System.out.println("enter fname");
				String fname11 = sc.nextLine();
				System.out.println("enter dob");
				String DOB11 = sc.nextLine();
				System.out.println("enter Address");
				String Address11 = sc.nextLine();
				System.out.println("enter phone");
				long phone11 = Long.parseLong(sc.nextLine());
				System.out.println("enter email");
				String email11 = sc.nextLine();
				System.out.println("enter class");
				String Class11 = sc.nextLine();
				System.out.println("enter aadhar");
				long aadhar11 = Long.parseLong(sc.nextLine());
				System.out.println("enter rollno");
				long rollno11 = Long.parseLong(sc.nextLine());
				System.out.println("enter course");
				String course11 = sc.nextLine();
				System.out.println("enter tid");
				long tid11 = Long.parseLong(sc.nextLine());
				System.out.println("enter course_id");
				long course_id11 = Long.parseLong(sc.nextLine());
				Student student2 = new Student(name11, fname11, DOB11, Address11, phone11, email11, Class11, aadhar11,
						rollno11, course11, tid11, course_id11);
				studentservice.SignUpStudent(student2);
				System.out.println("-------------------------------------------");
				break;
			case 2:
				System.out.print("\n------------------- Login -------------------\n");
				System.out.print("Enter email = ");
				String email0 = sc.nextLine();
				System.out.print("Enter password = ");
				String password = sc.nextLine();
				if (email0.equals("admin") && password.equals("admin123")) {
					System.out.println("Login Successful");
					System.out.println("\n--------------- Welcome in our School ---------------\n");
					System.out.println("------------------------------");
					boolean adminMenu = true;
					while (adminMenu) {
						System.out.println("1 for course---------");
						System.out.println("2 for student----------");
						System.out.println("3 for teacher------------");
						System.out.println("4 for exiting .....");
						System.out.println("................enter your choice...............");
						int ch = Integer.parseInt(sc.nextLine());
						
						switch (ch) {
						case 1:
							boolean courseMenu = true;
							while (courseMenu) {
								System.out.println("*******************for course********************");
								System.out.println("----------press 1 for adding course");
								System.out.println("----------press 2 for retrieve course");
								System.out.println("----------press 3 for existing course");
								System.out.println("................enter your choice..............");
								int choice2 = Integer.parseInt(sc.nextLine());
								switch (choice2) {
								case 1:
									try {
										System.out.println("enter course_id");
										long course_id1 = Long.parseLong(sc.nextLine());
										System.out.println("enter course_name");
										String course_name = sc.nextLine();
										course course1 = new course(course_id1, course_name);
										courseservice.addCourse(course1);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n adding course error");
									}
									System.out.println("-------------------------------------------");
									break;
								case 2:
									try {
										System.out.println("***********Uploading List***********");
										List<course> courses = courseservice.fetcAllcourses();
										System.out.println("-------------------course list------------------");
										for (course s : courses) {
											System.out.println(s.getCourse_id() + ":" + s.getCourse_name());
										}
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n retrieve course error");
									}
									System.out.println("-------------------------------------------");
									break;
								case 3:
									System.out.println("-------Thanku---------");
									System.out.println("Existing.............");
									// sc.close();
									// System.exit(0);
									courseMenu = false;
									System.out.println("-------------------------------------------");
									break;
								default:
									System.out.println(
											"-----------invalid choice please try again--------------------\n");
									System.out.println("-------------------------------------------");
								}
							}
						case 2: 
							boolean studentMenu = true;
							while (studentMenu) {
								System.out.println("*************************for student***************************");
								System.out.println("0 for login--------");
								System.out.println("1 for adding student----------");
								System.out.println("2 for view student-----------");
								System.out.println("3 for exit-----------------");
								System.out.println("4 for delete student by name----------------");
								System.out.println("5 for delete student by class---------------");
								System.out.println("6 for delete student by address-------------");
								System.out.println("7 for delete student by course_id-----------");
								System.out.println("8 for delete student by rollno--------------");
								System.out.println("9 for update studentname by rollno----------");
								System.out.println("10 for update studentcourse by name---------");
								System.out.println("11 for update studentaddress by tid---------");
								System.out.println("12 for update studentclass by email---------");
								System.out.println("13 for searching student by address---------");
								System.out.println("14 for searching student by name------------");
								System.out.println("15 for searching student by tid-------------");
								System.out.println("................enter your choice..............");
								int choice1 = Integer.parseInt(sc.nextLine());
								switch (choice1) {
								/*
								 * case 0:try {
								 * System.out.println("--------------------login-----------------");
								 * System.out.println("enter name"); String name0=sc.nextLine();
								 * System.out.println("enter rollno"); long
								 * rollno0=Long.parseLong(sc.nextLine()); Student
								 * s=studentservice.Login_service(name0,rollno0); //
								 * System.out.println(student); //for(Student s:student) {
								 * if(s.getName().equalsIgnoreCase(name0)&&s.getRollno()==(rollno0)) {
								 * System.out.println(s); //
								 * System.out.println(s.getName()+":"+s.getFname()+":"+s.getDOB()+":"+s.
								 * getAddress()+":"+s.getPhone()+":"+s.getEmail()+":"+s.getClass1()+":"+s.
								 * getAadhar()+":"+s.getRollno()+":"+s.getCourse()+":"+s.getTid()+":"+s.
								 * getCourse_id()); } else System.out.println("wrong name or wrong rollno"); }
								 * catch(Exception e) {
								 * System.out.println(e.getMessage()+"\n login student error"); } break;
								 */
								case 1:
									System.out.println("--------------------sign up-----------------");
									System.out.println("enter name");
									String name = sc.nextLine();
									System.out.println("enter fname");
									String fname = sc.nextLine();
									System.out.println("enter dob");
									String DOB = sc.nextLine();
									System.out.println("enter Address");
									String Address = sc.nextLine();
									System.out.println("enter phone");
									long phone = Long.parseLong(sc.nextLine());
									System.out.println("enter email");
									String email = sc.nextLine();
									System.out.println("enter class");
									String Class1 = sc.nextLine();
									System.out.println("enter aadhar");
									long aadhar = Long.parseLong(sc.nextLine());
									System.out.println("enter rollno");
									long rollno = Long.parseLong(sc.nextLine());
									System.out.println("enter course");
									String course = sc.nextLine();
									System.out.println("enter tid");
									long tid = Long.parseLong(sc.nextLine());
									System.out.println("enter course_id");
									long course_id = Long.parseLong(sc.nextLine());
									Student student1 = new Student(name, fname, DOB, Address, phone, email, Class1,
											aadhar, rollno, course, tid, course_id);
									studentservice.addStudent(student1);
									System.out.println("-------------------------------------------");
									break;
								case 2:
									try {
										System.out.println("***********Uploading List***********");
										List<Student> students = studentservice.fetchAllStudents();
										System.out.println("-------------------student list------------------");
										for (Student s : students) {
											System.out.println(s.getName() + ":" + s.getFname() + ":" + s.getDOB() + ":"
													+ s.getAddress() + ":" + s.getPhone() + ":" + s.getEmail() + ":"
													+ s.getClass1() + ":" + s.getAadhar() + ":" + s.getRollno() + ":"
													+ s.getCourse() + ":" + s.getTid() + ":" + s.getCourse_id());
										}
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n delete student error");
									}
									System.out.println("-------------------------------------------");
									break;
								case 4:
									try {
										System.out.println("delete student by name");
										System.out.println("enter student name");
										String sname = sc.nextLine();
										studentservice.deleteStudentbyName(sname);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n delete student error");
									}
									break;
								case 5:
									try {
										System.out.println("delete student by class");
										System.out.println("enter student class");
										String class1 = sc.nextLine();
										studentservice.deleteStudentbyClass(class1);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n delete student error");
									}
									break;
								case 6:
									try {
										System.out.println("delete student by address");
										System.out.println("enter student address");
										String address = sc.nextLine();
										studentservice.deleteStudentbyAddress(address);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n delete student error");
									}
									System.out.println("-------------------------------------------");
									break;
								case 7:
									try {
										System.out.println("delete student by course_id");
										System.out.println("enter student course_id");
										Long course_id1 = Long.parseLong(sc.nextLine());
										studentservice.deleteStudentbycourse_id(course_id1);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n delete student error");
									}
									System.out.println("-------------------------------------------");
									break;
								case 8:
									try {
										System.out.println("delete student by rollno");
										System.out.println("enter student rollno");
										long rollno1 = Long.parseLong(sc.nextLine());
										studentservice.deleteStudentbyRollno(rollno1);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n delete student error");
									}
									System.out.println("-------------------------------------------");
									break;
								case 9:
									try {
										System.out.println("update studentname by rollno");
										System.out.println("enter student rollno");
										long rollno1 = Long.parseLong(sc.nextLine());
										System.out.println("enter student name");
										String name1 = sc.nextLine();
										studentservice.UpdateStudentNamebyRollno(name1, rollno1);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n update student error");
									}
									break;
								case 10:
									try {
										System.out.println("update studentcourse by name");
										System.out.println("enter student course");
										String course1 = sc.nextLine();
										System.out.println("enter student name");
										String name2 = sc.nextLine();
										studentservice.UpdateStudentCoursebyName(course1, name2);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n update student error");
									}
									break;
								case 11:
									try {
										System.out.println("update studentaddress by tid");
										System.out.println("enter student tid");
										long tid1 = Long.parseLong(sc.nextLine());
										System.out.println("enter student address ");
										String address1 = sc.nextLine();
										studentservice.UpdateStudentAddressbyTid(address1, tid1);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n update student error");
									}
									break;
								case 12:
									try {
										System.out.println("update studentclass by email");
										System.out.println("enter student email");
										String email1 = sc.nextLine();
										System.out.println("enter student course");
										String class1 = sc.nextLine();
										studentservice.UpdateStudentClassbyEmail(class1, email1);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n update student error");
									}
									break;
								case 13:
									try {
										System.out.println("enter student address ");
										String address2 = sc.nextLine();
										Student s = studentservice.SearchByAddress1(address2);
										if (s.getAddress().equalsIgnoreCase(address2)) {
											System.out.println(s);
										} else {
											System.out.println("\n--------------No Student Found\n");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n search student error");
									}
									break;
								case 14:
									try {
										System.out.println("enter student name ");
										String name3 = sc.nextLine();
										Student s = studentservice.SearchByName1(name3);
										if (s.getName().equalsIgnoreCase(name3)) {
											System.out.println(s);
										} else {
											System.out.println("\n--------------No Student Found\n");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n search student error");
									}
									break;
								case 15:
									try {
										System.out.println("enter student tid ");
										long tid3 = Long.parseLong(sc.nextLine());
										Student s = studentservice.SearchByTid1(tid3);
										if (s.getTid() == tid3) {
											System.out.println(s);
										} else {
											System.out.println("\n--------------No Student Found\n");
										}
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n search student error");
									}
									break;

								case 3: 
									System.out.println("-------Thanku---------");
									System.out.println("Existing.............");
									studentMenu = false; 
									// sc.close();
									 //System.exit(0);
									break;
								default:
									System.out.println(
											"-----------invalid choice please try again--------------------\n");

									System.out.println("-------------------------------------------");
								}
							}
						case 3:
							boolean teacherMenu = true;
							while (teacherMenu) {
								System.out.println("++++++++++for teacher++++++++++");
								System.out.println("----------press 1 for adding teacher");
								System.out.println("----------press 2 for retrieve teacher");
								System.out.println("----------press 3 for exiting teacher");
								System.out.println("................enter your choice..............");
								int choice = Integer.parseInt(sc.nextLine());
								switch (choice) {
								case 1:
									try {
										System.out.println("enter tid");
										long tid = Long.parseLong(sc.nextLine());
										System.out.println("enter tname");
										String tname = sc.nextLine();
										System.out.println("enter salary");
										double salary = Double.parseDouble(sc.nextLine());
										Teacher teacher1 = new Teacher(tid, tname, salary);
										teacherservice.addTeacher(teacher1);
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n adding teacher error");
									}
									break;
								case 2:
									try {
										System.out.println("***********Uploading List***********");
										List<Teacher> teachers = teacherservice.fetcAllTeachers();
										System.out.println("-------------------teacher list------------------");
										for (Teacher s : teachers) {
											System.out.println(s.getTid() + ":" + s.getTname() + ":" + s.getSalary());
										}
									} catch (Exception e) {
										System.out.println(e.getMessage() + "\n retrieve teacher error");
									}
									break;
								case 3:
									System.out.println("-------Thanku---------");
									System.out.println("Exiting.............");
									teacherMenu = false;
									// sc.close();
									break;
								default:
									System.out.println(
											"-----------invalid choice please try again--------------------\n");
									System.out.println("-------------------------------------------");
						case 4 :
							System.out.println("Exiting");
							adminMenu=false;
							break;
								
								}

							}
							
						}
						
					}
					
				}
				
				else {
					System.out.println("Invalid Credentials");
				}
				break;
			
			case 3:
				System.out.println("-------Thanku---------");
				System.out.println("Existing.............");
				// sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("------------------invalid choice please try again--------------");

			}
		}
	}

}
