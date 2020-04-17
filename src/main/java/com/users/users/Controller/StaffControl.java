package com.users.users.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.users.Model.Staff;
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
	
}
