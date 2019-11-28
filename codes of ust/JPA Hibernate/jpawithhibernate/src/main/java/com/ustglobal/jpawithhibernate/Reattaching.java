package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class Reattaching {
public static void main(String[] args) {
	EntityManager em=null;
	EntityTransaction et=null;
	
	try {
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("TestPersistence");
		em = ef.createEntityManager();
		et = em.getTransaction();
		et.begin();
		Product p = em.find(Product.class, 101);
		System.out.println(em.contains(p));
		em.detach(p);
		System.out.println(em.contains(p));
		Product p2=em.merge(p);
		p2.setPname("Button");
		System.out.println("Record Updatted");
		et.commit();
		em.clear();
	} catch (Exception e) {
		e.printStackTrace();
		et.rollback();
	}
	em.close();
}
}
