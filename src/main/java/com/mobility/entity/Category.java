package com.mobility.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "category")
public class Category {

	@Id
	private String id;
	
	@Column(name="name_en")
	private String EnName;
	
	@Column(name="name_ar")
	private String ArName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return this.getId() + ", " + this.getEnName();
	}

	public String getEnName() {
		return EnName;
	}

	public void setEnName(String enName) {
		EnName = enName;
	}

	public String getArName() {
		return ArName;
	}

	public void setArName(String arName) {
		ArName = arName;
	}
}
