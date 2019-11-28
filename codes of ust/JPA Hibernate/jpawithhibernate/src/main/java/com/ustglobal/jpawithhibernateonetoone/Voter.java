package com.ustglobal.jpawithhibernateonetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="voter")
public class Voter {
	@Id
	@Column
	private int vid;
	@Column
	private String vname;
	@lombok.ToString.Exclude
	@OneToOne(mappedBy = "voter")
	
	private Person person;

}
