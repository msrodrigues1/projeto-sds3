package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable  {

	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sumDouble;
	
	public SaleSumDTO() {
	}
	
	public SaleSumDTO(Seller seller, Double sumDouble) {
		sellerName = seller.getName();
		this.sumDouble = sumDouble;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Double getSumDouble() {
		return sumDouble;
	}
	public void setSumDouble(Double sumDouble) {
		this.sumDouble = sumDouble;
	}
}
