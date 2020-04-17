package com.users.users.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.users.Dao.StaffDao;
import com.users.users.Model.Staff;

@Service
public class StaffService {
	
	@Autowired
	StaffDao dao;
	
	public Staff AddStaff(Staff staff)
	{
		dao.save(staff);
		return staff;
	}
	public List<Staff> GetStaff()
	{
		return dao.findAll();
	}
}
