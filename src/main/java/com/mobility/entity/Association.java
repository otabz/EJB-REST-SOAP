package com.mobility.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.NumericField;


@Entity(name="provider_payer_association")
public class Association implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4010544077569398020L;

	@Id
	@Column(name="provider_id")
	private Integer provider;
	
	@Id
	@Column(name="payer_id")
	//@NumericField
	//@Field(name="payer")
	private Integer payer;
	
	private String code;

	public Integer getProvider() {
		return provider;
	}

	public void setProvider(Integer provider) {
		this.provider = provider;
	}

	public Integer getPayer() {
		return payer;
	}

	public void setPayer(Integer payer) {
		this.payer = payer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

