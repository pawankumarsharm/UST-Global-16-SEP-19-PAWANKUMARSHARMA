package com.ustglobal.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamicData {

	public static void main(String[] args) {
		
		EntityManager em=null;
		EntityTransaction et=null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			String jpql = "delete from Product where pid=:id";
			Query query = em.createQuery(jpql);
			query.setParameter("id", 101);
			int result = query.executeUpdate();
			System.out.println(result+"Result Deleted");
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	
	}

}
