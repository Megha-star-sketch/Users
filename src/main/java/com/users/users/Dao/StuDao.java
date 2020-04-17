package com.users.users.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.users.Model.Student;
@Repository
public interface StuDao extends JpaRepository<Student,Integer>
{

}
