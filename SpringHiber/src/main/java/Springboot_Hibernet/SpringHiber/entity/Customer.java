package Springboot_Hibernet.SpringHiber.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	private int cust_Id;
	private String cust_name;
	private int amount;
	
	@Id
	public int getCust_Id() {
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return "Customer [cust_Id=" + cust_Id + ", cust_name=" + cust_name + ", amount=" + amount + "]";
	}
		

}
