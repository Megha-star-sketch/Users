package com.users.users.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Student Register(@RequestBody Student stu)
	{
		return service.AddStudent(stu);
	}
	
	@GetMapping("/getAll")
	public List<Student> GetAllStu(@PathVariable String name)
	{
		return service.GetAll();
	}
	
	@PutMapping("/update/{name}")
	public Student UpdateStu(@RequestBody Student stu)
	{
		return service.Update(stu);
	}
	
	@GetMapping("/getid/{stu_id}")
	public Student GetByIdStu(@PathVariable int stu_id)
	{
		return service.GetById(stu_id);
	}
	
	@GetMapping("/getname/{name}")
	public Student GetByNameStu(@PathVariable String name)
	{
		return service.GetByName(name);
	}
	
	@DeleteMapping("/deleteall")
	public Student DeleteAllStu(@RequestBody Student stu)
	{
		return service.DeleteAll(stu);
	}

	@DeleteMapping("/delete/{stu_id}")
	public void DeleteByIdStu(@PathVariable int stu_id)
	{
		service.DeleteById(stu_id);
	}
}
