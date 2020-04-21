package com.users.users.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.users.Model.Staff;
import com.users.users.Model.Student;
import com.users.users.Service.StaffService;

@RestController
@RequestMapping("/Staff")
public class StaffControl {
	@Autowired
	StaffService service;
	
	@PostMapping("/add")
	public Staff PostAllStaff(@RequestBody Staff staff)
	{
		return service.AddStaff(staff);
	}
	
	@GetMapping("/getAll")
	public List<Staff> GetAll()
	{
		return service.GetStaff();
	}
	
	@PutMapping("/staffupdate/{name}")
	public Staff UpdateStu(@RequestBody Staff staff)
	{
		return service.Update(staff);
	}
	
	@GetMapping("/staffgetid/{staff_id}")
	public Staff GetByIdSt(@PathVariable int staff_id)
	{
		return service.GetById(staff_id);
	}
	
	@DeleteMapping("/staffdeleteall")
	public Staff DeleteAllStu(@RequestBody Staff staff)
	{
		return service.DeleteAll(staff);
	}
	
	@DeleteMapping("/deletestaff/{staff_id}")
	public void DeleteByIdStaff(@PathVariable int staff_id)
	{
		service.DeleteById(staff_id);
	}
}
