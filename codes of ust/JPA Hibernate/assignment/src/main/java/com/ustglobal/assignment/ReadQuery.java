package com.ustglobal.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.assignment.dto.Department;

public class ReadQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em=emf.createEntityManager();
		Department d=em.find(Department.class,90);
		System.out.println("Department number is---->"+d.getDept_no());
		System.out.println("Department Name is--->"+d.getDname());
		System.out.println("Department Location is ---->"+d.getLocation());
	}

}
