package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetReference {

	public static void main(String[] args) {
			
		EntityManager e=null;
		EntityTransaction t=null;
		
		EntityManagerFactory f=Persistence.createEntityManagerFactory("TestPersistence");
		e=f.createEntityManager();
		Product p=e.getReference(Product.class,101);
		System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getQuantity());
		e.close();
	}

}
