package com.users.users.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.users.Controller.StudentNotFoundException;
import com.users.users.Dao.StaffDao;
import com.users.users.Model.Staff;
import com.users.users.Model.Student;

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
	public Staff Update(Staff staff)
	{
		return dao.save(staff);
	}
	public Staff GetById(int staff_id)
	{
		Optional<Staff> staff = dao.findById(staff_id);
			if (!staff.isPresent()) throw new StudentNotFoundException("id-" + staff_id);

		return staff.get();

	}
	public Staff DeleteAll(Staff staff)
	{
		dao.deleteAll();
		return staff;
	}
	public void DeleteById(int staff_id)
	{
		dao.deleteById(staff_id);
	}
}
