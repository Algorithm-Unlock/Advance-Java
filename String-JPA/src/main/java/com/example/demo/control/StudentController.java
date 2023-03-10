package com.example.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;


@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;
	@GetMapping("students")
	public String getStudents() {
		return repo.findAll().toString();
	}
	

}
