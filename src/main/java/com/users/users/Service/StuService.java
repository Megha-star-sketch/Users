package com.users.users.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.users.Controller.StudentNotFoundException;
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
	
	public List<Student> GetAll()
	{
		return dao.findAll();
	}
	
	public Student Update(Student stu)
	{
		return dao.save(stu);
	}
	
	public Student GetById(int stu_id)
	{
		Optional<Student> student = dao.findById(stu_id);
			if (!student.isPresent()) throw new StudentNotFoundException("id-" + stu_id);

		return student.get();

	}
	
	public Student GetByName(String name)
	{
		//return dao.findById(stu_id);
		Optional<Student> student1 = dao.findByName(name);
			if (!student1.isPresent())
				throw new StudentNotFoundException("name-" + name);
			
			return student1.get();
	}
	
	public Student DeleteAll(Student stu)
	{
		dao.deleteAll();
		return stu;
	}
	
	public void DeleteById(int stu_id)
	{
		dao.deleteById(stu_id);
	}
}
