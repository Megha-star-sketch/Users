package com.users.users.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.users.Model.Student;
import com.users.users.Service.StuService;

@RestController
@RequestMapping("/Student")
public class StuControl {
	
	@Autowired
	private StuService service;
	
	@PostMapping("/data")
	public Student postAllData(@RequestBody Student stu)
	{
		return service.AddStudent(stu);
	}

}
