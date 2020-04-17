package com.users.users.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.users.Dao.StuDao;
import com.users.users.Model.Student;

@Service
public class StuService {
	@Autowired
	private StuDao dao;
	
	public Student AddStudent(Student stu)
	{
		dao.save(stu);
		return stu;
	}
}
