package com.testcon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Studentbean.xml");
		Student stu=(Student)con.getBean("studentBean");
		stu.studentDetails();

	}

}
