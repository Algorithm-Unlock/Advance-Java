package com.example.Springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Springboot.dao.customerDao;
import com.example.Springboot.dao.customerDaoImp;
import com.example.Springboot.model.customer;

public abstract class CustomerServiceImp {
	@Autowired
	private customerDaoImp cdimp;

	public List<customer> getallcustomerDetails() throws Exception
	 {
		List<customer> clist = cdimp.getallcustomerDetails();
		if(clist == null){
			throw new Exception("No customer Available");
		}
		return clist;
	 }
	public customer getCustomer(Integer customerId) throws Exception{
		customer cdetails = cdimp.getcustomer(customerId);
		if (cdetails == null){
			throw new Exception("No customer Available with this customerId " + customerId);
		}
		return cdetails;
	}
	public void addCustomer(customer c) throws Exception{
		if(cdimp.getcustomer(c.getCustomerId()) != null){
			throw new Exception(" customer already exist");
			
		}
	}
	public void updateEmail(int customerId ,String cutomerEmail) throws Exception{
		customer cdetails = cdimp.getcustomer(customerId);
		if(cdetails==null) {
			throw new Exception("No customer Available with this ID"+customerId);
		}
		cdimp.updateEmail(customerId, cutomerEmail);
	}
}
		