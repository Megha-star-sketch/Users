package com.users.users.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.users.Model.Staff;
@Repository
public interface StaffDao extends JpaRepository<Staff,Integer> {

}
