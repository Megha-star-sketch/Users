package com.users.users.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Student")
public class Student {
	@Id
	int stu_id;
	String name;
	String address;
	String phone;
	String email;
	String dob_date;
	String doj_date;
	String qualification;
	float criteria;
	String password;
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob_date() {
		return dob_date;
	}
	public void setDob_date(String dob_date) {
		this.dob_date = dob_date;
	}
	public String getDoj_date() {
		return doj_date;
	}
	public void setDoj_date(String doj_date) {
		this.doj_date = doj_date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public float getCriteria() {
		return criteria;
	}
	public void setCriteria(float criteria) {
		this.criteria = criteria;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
