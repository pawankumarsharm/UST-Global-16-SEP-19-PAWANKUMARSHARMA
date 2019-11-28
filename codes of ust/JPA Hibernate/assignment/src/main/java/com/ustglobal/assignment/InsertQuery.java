package com.ustglobal.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment.dto.Department;

public class InsertQuery {

	public static void main(String[] args) {
		Department dept=new Department();
		dept.setDept_no(90);
		dept.setDname("HR");
		dept.setLocation("Banglore");
		
		EntityManager e=null;
		EntityTransaction t=null;
		
		try {
			EntityManagerFactory f = Persistence.createEntityManagerFactory("TestPersistence");
			e = f.createEntityManager();
			t = e.getTransaction();
			t.begin();
			e.persist(dept);
			System.out.println("Record Saved");
			t.commit();
		} catch (Exception e2) {
			e2.printStackTrace();
			t.rollback();
		}
		e.close();
		
	}

}
