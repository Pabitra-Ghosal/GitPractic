package com.google.service;

import com.google.entity.Student;

public interface StudentService {
	
	public String addStudent(Student std);
	public Student searchStudent(String sid);
	public String updateStudent(Student std,String sid);
	public String deleteStudent(String sid);

}
