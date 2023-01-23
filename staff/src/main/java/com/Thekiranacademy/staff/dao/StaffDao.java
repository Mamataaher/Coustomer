package com.Thekiranacademy.staff.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Thekiranacademy.staff.entity.Staff;

@Repository
public class StaffDao {

	@Autowired
	SessionFactory sf;
	
	public List<Staff> getAllRecord() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		List<Staff> list=criteria.list();
		session.close();
		return list;
	}

	public Staff getById(int staffid) {

		Session session=sf.openSession();
		Staff id=session.get(Staff.class,staffid);
		session.close();		
		return id;
	}

	public String getInsert(Staff s) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
		return "Data Inserted";
	}

	public List<Staff> getSalary() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		criteria.add(Restrictions.gt("salary", 20000));
		List<Staff> list=criteria.list();
		session.close();
		return list;
	}
	
	public List<Staff> getExperience(){
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		criteria.add(Restrictions.between("experience", 10, 20));
		List<Staff> list=criteria.list();
		session.close();
		return list;
	}
	/*
	public Staff getMaxSalary() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		criteria.add(Restrictions.)
		session.close();
	}*/
	
	public String getUpdate(Staff id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.update(id);
		tr.commit();
		session.close();
		return "Data Updated";
	}
	
	public List<Staff> getProfile(){
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		criteria.add(Restrictions.like("profile", "Trainer"));
		List<Staff> list=criteria.list();
		session.close();
		return list;
	}
	
	public List<Staff> getProfileNot(){
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		criteria.add(Restrictions.ne("profile", "Trainer"));
		List<Staff> list=criteria.list();
		session.close();
		return list;
	}
}
