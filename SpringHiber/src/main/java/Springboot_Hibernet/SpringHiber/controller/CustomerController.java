package Springboot_Hibernet.SpringHiber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Springboot_Hibernet.SpringHiber.entity.Customer;
import Springboot_Hibernet.SpringHiber.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@GetMapping("/all")
	public List<Customer> getAllInfo() {
		List<Customer> list=cs.getAllInfo();
		return list;
	}
	
	@PostMapping("/insert")
	public boolean getInsert(@RequestBody Customer cust){
		boolean insert=cs.getInsert(cust);
		return insert;
	}
	
	@GetMapping("cust/{cust_id}")
	public Customer getCustomerbyId(@PathVariable int cust_id) {
		Customer id=cs.getCustomerbyId(cust_id);
		return id;
	}
	
	@DeleteMapping("/delete/{cust_id}")
	public boolean deleteCustId(@PathVariable int cust_id) {
		boolean deleted=cs.deletCustId(cust_id);
		return deleted;
	}
}
