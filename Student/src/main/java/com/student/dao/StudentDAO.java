package com.student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;


@Repository
public class StudentDAO {
	
	@Autowired
	SessionFactory sf;
	
	public List<Student> getStudent(){
		Session session= sf.openSession();
		Criteria criteria= session.createCriteria(Student.class);
		List<Student> list=criteria.list();
		session.close();
		return list;
	}

	public String setStudent(Student stud) {
		Session session= sf.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(stud);
		tr.commit(); 
		session.close(); 
		return "Data Inserted";
	}
	
	public String deleteStudent(int sid) {
		Session session= sf.openSession();
		Transaction tr=session.beginTransaction();
		Student id=session.get(Student.class, sid);
		session.delete(id);
		tr.commit();
		session.close();
		return "Data Deleted";
	}
	
	public String updateStudent(Student sid) {
		Session session=sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(sid);
		tr.commit();
		session.close();
		return "Data Updated";
	}
}
