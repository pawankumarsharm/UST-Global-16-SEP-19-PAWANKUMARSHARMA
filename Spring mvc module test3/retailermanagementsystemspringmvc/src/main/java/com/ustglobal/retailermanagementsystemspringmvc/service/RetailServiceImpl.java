package com.ustglobal.retailermanagementsystemspringmvc.service;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailermanagementsystemspringmvc.dao.RetailDao;
import com.ustglobal.retailermanagementsystemspringmvc.dto.OrderBean;
import com.ustglobal.retailermanagementsystemspringmvc.dto.RetailBean;
@Service
public class RetailServiceImpl implements RetailService {
	@Autowired
	private RetailDao dao;

	@Override
	public boolean createProfile(RetailBean bean) {
		
		return dao.createProfile(bean);
	}

	@Override
	public RetailBean login(int id, String password) {
		
		return dao.login(id, password);
	}

	@Override
	public OrderBean searchProduct(int pid) {
		return dao.searchProduct(pid);
	}

	@Override
	public boolean updatePassword(int rid, String password) {
		return dao.updatePassword(rid, password);
	}

	@Override
	public double sumAmount(int id) {
		return dao.sumAmount(id);
	}

	@Override
	public Object retreiveOrder(int oid) {
		return dao.retreiveOrder(oid);
	}

}
