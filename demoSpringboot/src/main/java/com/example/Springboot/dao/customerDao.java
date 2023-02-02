package com.example.Springboot.dao;
import java.util.*;
import com.example.Springboot.model.customer;


public abstract class customerDao implements customerDaoImp
{
	private Map<Integer,customer> customers=new HashMap<Integer,customer>();
	public customerDao()
	{
		customers.put(41,new customer(41,"Bhuwan","bhuwan@gmail.com",1325653));
		customers.put(18,new customer(18,"Amit","amit@gmail.com",132563453));
	}
	@Override
	public List<customer> getallcustomerDetails()
	{
		return new ArrayList<customer>(customers.values());
		
	}
	@Override
	public customer getcustomer(int customerId)
	{
		return customers.get(customerId);
		
	}
	@Override
	public void addCustomer(customer customer)
	{
		customers.put(customer.getCustomerId(),customer);
		
	}
	@Override
	public void updateEmail(int customerId , String customerEmail)
	{
		customers.get(customerId).setCustomerEmail(customerEmail);
			
	}
	@Override
	public void updatePhone(int customerId, int customerPhone)
	{
		customers.get(customerId).setCustomerPhone(customerPhone);
	}
	@Override
	public void removeCustomer(int customerId)
	{
		customers.remove(customerId);
	}
	
}
	

