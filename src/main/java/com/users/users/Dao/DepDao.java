package com.users.users.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.users.users.Model.Department;

@Repository
public interface DepDao extends JpaRepository<Department,Integer>{
	
	public Department save(Department dept);
	
	public void deleteById(@PathVariable int d_id);
	

	@Query("select u from Department u")
	public List<Department> getAll();


	public List<Department> findById(int id);
	
//	@Transactional
//	@Modifying
//	@Query("update Department d set d.name=?1 where d.id=?2")
//	int setDepartmentName( @Param("id") int d_id,@Param("name")String d_name);
	
//	@Modifying
//	@Transactional
//	public Department update(@RequestBody Department dept);
//	
	
	
	
}
