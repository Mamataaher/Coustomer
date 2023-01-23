package Springboot_Hibernet.SpringHiber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Springboot_Hibernet.SpringHiber.dao.CustomerDao;
import Springboot_Hibernet.SpringHiber.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao cd;
	
	public List<Customer> getAllInfo() {
		List<Customer> list=cd.getAllInfo();
		return list;
	}

	public boolean getInsert(Customer cust) {
		boolean insert=cd.getInsert(cust);
		return insert;
	}


	public Customer getCustomerbyId(int cust_id) {
		return cd.getCustomerbyId(cust_id);
	}

	public boolean deletCustId(int cust_id) {
		return cd.deleteCustId(cust_id);
	}

}
