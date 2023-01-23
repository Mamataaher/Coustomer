package com.Thekiranacademy.staff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Thekiranacademy.staff.dao.StaffDao;
import com.Thekiranacademy.staff.entity.Staff;

@Service
public class StaffService {

	@Autowired
	StaffDao dao;
	
	public List<Staff> getAllRecord(){
		List<Staff> list=dao.getAllRecord();
		return list;
	}

	public Staff getById(int staffid) {
		Staff id=dao.getById(staffid);
		return id;
	}

	public String getInsert(Staff s) {
		String insert=dao.getInsert(s);
		return insert;
	}

	public List<Staff> getSalary() {
		List<Staff> list=dao.getSalary();
		return list;
	}

	public List<Staff> getExperience() {
		List<Staff> list=dao.getExperience();
		return list;
	}
	
	public String getUpdate(Staff id) {
		String idd=dao.getUpdate(id);
		return idd;
		
	}
	
	public List<Staff> getProfile(){
		List<Staff> list=dao.getProfile();
		return list;
	}
	
	public List<Staff> getProfileNot(){
		List<Staff> list=dao.getProfileNot();
		return list;
	}
}
