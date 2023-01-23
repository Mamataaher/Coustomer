package Springboot_Hibernet.SpringHiber.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Springboot_Hibernet.SpringHiber.entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory sf;

	public List<Customer> getAllInfo() {
		Session session= sf.openSession();
		Criteria criteria= session.createCriteria(Customer.class);
		List<Customer> list=criteria.list();
		session.close();
		return list;
	}

	public boolean getInsert(Customer cust) {

		Session session= sf.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(cust);
		tr.commit(); 
		session.close();
		
		return true;
	}

	public Customer getCustomerbyId(int cust_id) {
		Session session= sf.openSession();
		Customer id=session.get(Customer.class, cust_id);
		session.close();
		return id;
	}

	public boolean deleteCustId(int cust_id) {
		Session session= sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		Customer id=session.get(Customer.class, cust_id);
		
		session.delete(id);
		tr.commit();
		session.close();
		return true;
	}

	
}
