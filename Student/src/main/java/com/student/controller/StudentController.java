package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;


@RestController
public class StudentController {

	@Autowired
	StudentService ser;
	
	@GetMapping("/allrecord")
	public List<Student> getStudent(){
		return ser.getStudent();
	}
	
	@PostMapping("/insert")
	public String setStudent(@RequestBody Student stud) {
		String insert=ser.setStudent(stud);
		return insert;
	}
	
	@DeleteMapping("/delete/{sid}")
	public String deleteStudent(@PathVariable int sid) {
		String delete=ser.deleteStudent(sid);
		return delete;
	}
	
	@PutMapping("/update")
	public String updateStudent(@RequestBody Student sid) {
		
		String update=ser.updateStudent(sid);
		return update;
	}
}
