package com.Thekiranacademy.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Thekiranacademy.staff.entity.Staff;
import com.Thekiranacademy.staff.service.StaffService;

@RestController
public class StaffController {

	@Autowired
	StaffService ser;
	
	@GetMapping("/all")
	public List<Staff> getAllRecord(){
		List<Staff> list=ser.getAllRecord();
		return list;
	}
	
	@GetMapping("/id/{staffid}")
	public Staff getById(@PathVariable int staffid) {
		Staff id=ser.getById(staffid);
		return id;
	}
	
	@PostMapping("/insert")
	public String getInsert(@RequestBody Staff s) {
		String insert=ser.getInsert(s);
		return "Data Inserted";
	}
	
	@GetMapping("/salary")
	public List<Staff> getSalary() {
		List<Staff> list=ser.getSalary();
		return list;
	}
	
	@GetMapping("/experience")
	public List<Staff> getExperience(){
		List<Staff> list=ser.getExperience();
		return list;
	}
	
	@PutMapping("/update")
	public String getUpdate(@RequestBody Staff id) {
		String d=ser.getUpdate(id);
		return d;
	}
	
	@GetMapping("/profile")
	public List<Staff> getProfile(){
		List<Staff> list=ser.getProfile();
		return list;
	}
	
	@GetMapping("/profileNot")
	public List<Staff> getProfileNot(){
		List<Staff> list=ser.getProfileNot();
		return list;
	}
}
