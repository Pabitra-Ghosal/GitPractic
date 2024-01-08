package com.google.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.google.entity.Student;
import com.google.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcomePage() {
		return "welcomeDef";
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public ModelAndView showAddPAge() {
		return new ModelAndView("addDef","student",new Student());
	}
	
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public ModelAndView showSearchPAge() {
		return new ModelAndView("searchDef","student",new Student());
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.GET)
	public ModelAndView showUpdatePAge() {
		return new ModelAndView("updateDef","student",new Student());
	}
	
	
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public ModelAndView showDeletePAge() {
		return new ModelAndView("deleteDef","student",new Student());
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public ModelAndView add(Student std) {
		String status=this.service.addStudent(std);
		return new ModelAndView("statusDef","status",status);
	}
	
	@RequestMapping(value = "/search",method = RequestMethod.POST)
	public ModelAndView search(Student std) {
		Student existedStd=this.service.searchStudent(std.getSid());
		if(existedStd==null)
			return new ModelAndView("status","status","Student not existed..");
		else
			return new ModelAndView("studentDetailsDef","student",std);
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public ModelAndView delete(Student std) {
		String status=this.service.deleteStudent(std.getSid());
		return new ModelAndView("statusDef","status",status);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ModelAndView showEditPAge(Student std) {
		Student existedStd=this.service.searchStudent(std.getSid());
		if(existedStd==null)
			return new ModelAndView("status","status","Student not existed..");
		else
			return new ModelAndView("editDef","student",existedStd);
	}
	
	@RequestMapping(value = "/edit",method = RequestMethod.POST)
	public ModelAndView update(Student std) {
		String status=this.service.updateStudent(std, std.getSid());
		return new ModelAndView("status","status",status);
	}
}
