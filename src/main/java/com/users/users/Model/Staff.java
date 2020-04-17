package com.users.users.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Staff")
public class Staff {
	@Id
	int staff_id;
	String name;
	String address;
	String phone_no;
	String email;
	String qualification;
	String experience;
	String dob_date;
	String doj_date;
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
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
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
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
	

}
