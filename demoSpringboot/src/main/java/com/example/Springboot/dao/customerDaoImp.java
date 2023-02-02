package com.example.Springboot.dao;
import java.util.List;
import com.example.Springboot.model.customer;

public interface customerDaoImp {
	public List<customer> getallcustomerDetails();
	public customer getcustomer(int customerId);
	public void addCustomer(customer c);
	public void updateEmail(int customerId,String customerEmail);
	public void updatePhone(int customerId,int customerPhone);
	public void removeCustomer(int customerId);
	

}
