package com.ustglobal.retailermanagementsystemspringmvc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="order")
public class OrderBean {
	@Id
	@Column
	@ManyToOne(cascade = CascadeType.ALL)
private int oid;
	@Column
	//@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pname", nullable = false)
	@Exclude
private String pname;
@Column
	private int punit;
@Column
private int pquantity;
@Column
private int amountpay;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
private int price;
@Column
//@ManyToMany(cascade = CascadeType.ALL)
@JoinColumn(name="pname", nullable = false)

public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPunit() {
	return punit;
}
public void setPunit(int punit) {
	this.punit = punit;
}
public int getPquantity() {
	return pquantity;
}
public void setPquantity(int pquantity) {
	this.pquantity = pquantity;
}
public int getAmountpay() {
	return amountpay;
}
public void setAmountpay(int amountpay) {
	this.amountpay = amountpay;
}
private RetailBean retailerid;

}
