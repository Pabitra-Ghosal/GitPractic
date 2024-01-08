package com.google.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.dao.StudentDao;
import com.google.entity.Student;
import com.google.service.StudentService;

@Service("service")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;

	@Transactional
	@Override
	public String addStudent(Student std) {
		String status=this.dao.add(std);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		return this.dao.search(sid);
	}

	@Transactional
	@Override
	public String updateStudent(Student std, String sid) {
		return this.dao.update(std, sid);
	}

	@Transactional
	@Override
	public String deleteStudent(String sid) {
		return this.dao.delete(sid);
	}

}
