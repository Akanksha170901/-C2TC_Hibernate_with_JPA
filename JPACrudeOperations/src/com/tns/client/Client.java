package com.tns.client;

import com.tns.entities.Student;
import com.tns.serivce.StudentService;
import com.tns.serivce.StudentServiceImpl;

public class Client {
	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		/*student.setStudentid(0);
		student.setName("Avantika");
		service.addStudent(student);
		student.setStudentid(1);
		student.setName("Avantika");
		service.addStudent(student);
		/*student.setStudentid(2);
		student.setName("Akanksha");
		service.addStudent(student);
		student.setStudentid(3);
		student.setName("Neha");
		service.addStudent(student);
		
		student.setStudentid(4);
		student.setName("Shruti");
		service.addStudent(student);*/
		
	
	// Retrieve Operation
		//service.findStudentById(4);
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
			
		
		
		//Update Operation
		//student  =service.findStudentById(1);
		//student.setName("krutika");
		//service.updateStudent(student);
		
		
		service.findStudentById(0);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());
		
		
		//Delete Operation
		student=service.findStudentById(0);
		service.removeStudent(student);
		System.out.println("Row removed");
		
		
	}

}
