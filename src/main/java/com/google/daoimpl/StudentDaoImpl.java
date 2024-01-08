package com.google.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.google.dao.StudentDao;
import com.google.entity.Student;

@Repository("dao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate template;
	
	@Override
	public String add(Student std) {
		String status="Student Insertion Failure..";
		try {
			Student existedStd=(Student)this.template.get(Student.class, std.getSid());
			if (existedStd == null) {
				String sid = (String) this.template.save(std);
				if (sid.equals(std.getSid()))
					status = "Student Insert Successfully..";
			} else
				status = "Student Already Existed..";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student search(String sid) {
		Student std=null;
		try {
			std=this.template.get(Student.class, sid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}

	@Override
	public String update(Student std, String sid) {
		String status="Student not update..";
		try {
			this.template.update(std);
			status="Student update Successfully..";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		String status="Student not deleted..";
		try {
			Student std=this.template.get(Student.class, sid);
			if(std==null)
				status="Student not existed..";
			else {
				this.template.delete(std);
				status="Student deleted successfully";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
