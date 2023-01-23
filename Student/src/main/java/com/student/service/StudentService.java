package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDAO;
import com.student.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO dao;
	
	public List<Student> getStudent(){
		return dao.getStudent();
	}

	public String setStudent(Student stud) {
		String insert=dao.setStudent(stud);
		return insert;
	}

	public String deleteStudent(int sid) {
		String delete=dao.deleteStudent(sid);
		return delete;
	}

	public String updateStudent(Student sid) {
		String update=dao.updateStudent(sid);
		return update;
	}

}
