package com.example.Springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springboot.model.customer;
import com.example.Springboot.service.CustomerService;

@RestController
@RequestMapping("/example")
public class CustomerController {
	@Autowired
	private CustomerService custservice;
	private HttpStatusCode HttpStatus;

	@GetMapping(value = "/customer")
	public ResponseEntity<List<customer>> getallcustomerDetails() throws Exception {
		List<customer> clist = custservice.getallcustomerDetails();
		ResponseEntity<List<customer>> response = new ResponseEntity<List<customer>>(clist, HttpStatus);
		return response;
	}

@GetMapping(value = "/customer/{customerId")
public ResponseEntity <customer> getcustomerDetails(@PathVariable Integer customerID) throws Exception{
customer cdetails = custservice.getcustomer(customerID);
ResponseEntity<customer>response = new ResponseEntity<customer>(cdetails,HttpStatus);
return response;
}

@PostMapping(value="/customer/{customerID")
public ResponseEntity <String> addCustomer(@RequestBody customer c)throws Exception{
	custservice.addCustomer(c);
	String msg="Customer Added Successfully";
	ResponseEntity<String> response=new ResponseEntity<String>(msg,HttpStatus);
	return response;
	
}
@PutMapping(value="/customer/{customerID")
public ResponseEntity <String> updateCustomer(@PathVariable customer c)throws Exception{
	custservice.addCustomer(c);
	String msg="Customer Added Successfully";
	ResponseEntity<String> response=new ResponseEntity<String>(msg,HttpStatus);
	return response;
}
}
