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
import com.users.users.Model.Department;
import com.users.users.Service.DepService;

@RestController
@RequestMapping("/Department")
public class DepControl {
	
	@Autowired
	private DepService service;
	
	@PostMapping("/addDepartment")
	public Department add(@RequestBody Department dept) {
		return service.add(dept);
	}
	

	@DeleteMapping("/delete/{id}")
	public void deleteDept(@PathVariable int id) {
		service.deleteDepartment(id);
	}
	
	@GetMapping("/getAll")
	public List<Department> getDept()
	{
		return service.getDept();
	}
	
	@GetMapping("/get/{id}")
	public List<Department> getDepartment(@PathVariable int id) {
		
		return service.getDepartmentName(id);
	}
	
//	@PutMapping("/update/{id}/{tech}")
//	public int UpdateName(@PathVariable("id") int d_id, @PathVariable("name") String d_name)
//	{
//		return service.updateByName(d_id,d_name);
//	}
	
//	@PutMapping("/update")
//	public Department updateName(@RequestBody Department dept)
//	{
//		return service.update(dept);
//	}
	
	
	
	
	
	

}
