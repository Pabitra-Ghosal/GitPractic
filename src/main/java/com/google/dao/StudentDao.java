package com.google.dao;

import com.google.entity.Student;

public interface StudentDao {
	
	public String add(Student std);
	public Student search(String sid);
	public String update(Student std,String sid);
	public String delete(String sid);

}
