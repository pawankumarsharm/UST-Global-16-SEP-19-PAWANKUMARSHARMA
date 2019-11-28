package com.ustglobal.beanobject.bean;

public class TestB {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.setId(1);
		e1.setSalary(110);
		e1.setName("pawan");
		e1.setDept("devlopment");
		e1.setDesignation("software devloper");
		Database1 d1=new Database1();
		d1.receive(e1);
		
	}

}
