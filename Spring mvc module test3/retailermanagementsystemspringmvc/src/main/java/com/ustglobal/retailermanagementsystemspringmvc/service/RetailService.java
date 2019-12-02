package com.ustglobal.retailermanagementsystemspringmvc.service;

import com.ustglobal.retailermanagementsystemspringmvc.dto.OrderBean;
import com.ustglobal.retailermanagementsystemspringmvc.dto.RetailBean;

public interface RetailService {
	public boolean createProfile(RetailBean bean);
	public RetailBean login(int id, String password);
	public OrderBean searchProduct(int pid);
	public boolean updatePassword(int rid,String password);
	public double sumAmount(int id);
	public Object retreiveOrder(int oid);
}
