package com.ustglobal.retailermanagementsystemspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.retailermanagementsystemspringmvc.dto.OrderBean;
import com.ustglobal.retailermanagementsystemspringmvc.dto.RetailBean;
@Repository
public class RetailDaoImpl implements RetailDao {
@PersistenceUnit
private EntityManagerFactory factory;
	@Override
	public boolean createProfile(RetailBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		entityTransaction.begin();
		try {
			manager.persist(bean);
			entityTransaction.commit();
			return true;
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
		return false;
		
	}
	

	@Override
	public RetailBean login(int id, String password) {
		String jpql="from RetailBean where id=:id and password=:pass";
		EntityManager manager =factory.createEntityManager();
		
		TypedQuery<RetailBean> query=manager.createQuery(jpql,RetailBean.class);
		
		query.setParameter("id",id);
		query.setParameter("pass",password);
		
		try {
			RetailBean bean=query.getSingleResult();
		return bean;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

		

	@Override
	public OrderBean searchProduct(int pid) {
EntityManager manager=factory.createEntityManager();
		
OrderBean bean=manager.find(OrderBean.class,pid);
		return bean;
	}

	@Override
	public boolean updatePassword(int rid, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		entityTransaction.begin();
		RetailBean bean=manager.find(RetailBean.class,rid);
		bean.setPassword(password);
		entityTransaction.commit();
		return true;
	}

	@Override
	public double sumAmount(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		entityTransaction.begin();
		OrderBean bean=manager.find(OrderBean.class,id);
		entityTransaction.commit();
		return bean.getAmountpay();
	}

	@Override
	public Object retreiveOrder(int oid) {
		EntityManager manager=factory.createEntityManager();
		List<OrderBean> bean=(List<OrderBean>) manager.find(OrderBean.class, oid);
		OrderBean bean1=new OrderBean();
		for (OrderBean orderBean : bean) {
		bean1.setPunit(orderBean.getPunit());
		bean1.setPrice(orderBean.getPrice());
			bean1.setAmountpay(orderBean.getAmountpay());
		}
		return bean1;
		
	}

}
