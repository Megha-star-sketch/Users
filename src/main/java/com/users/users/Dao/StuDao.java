package com.users.users.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.users.Model.Student;
@Repository
public interface StuDao extends JpaRepository<Student,Integer>
{
	Optional<Student> findByName(String name);
}
