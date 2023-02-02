package com.example.Springboot.service;
import java.util.List;
import com.example.Springboot.model.customer;

public abstract class CustomerService {
	public abstract List<customer> getallcustomerDetails() throws Exception;
	public abstract customer getcustomer(Integer customerId) throws Exception;
	public abstract void addCustomer(customer c) throws Exception;
	public abstract void updateEmail(int customerId,String customerEmail) throws Exception;
	public abstract void updatephone(int customerId,int customerPhone) throws Exception;
	
	
}
