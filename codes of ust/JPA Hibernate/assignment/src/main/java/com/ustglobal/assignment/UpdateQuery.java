package com.ustglobal.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment.dto.Department;

public class UpdateQuery {

	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction t=null;
		
		try {
			EntityManagerFactory f = Persistence.createEntityManagerFactory("TestPersistence");
			em = f.createEntityManager();
			t = em.getTransaction();
			t.begin();
			Department d = em.find(Department.class, 90);
			d.setDname("Manager");
			;
			System.out.println("Record Updated");
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		em.close();
		
	}

}