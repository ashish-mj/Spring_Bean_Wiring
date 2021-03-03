package com.rakuten.spring.beans;

public class ProductService {
public ProductService() {
	System.out.println("constructor product service");
}
	private ProductRepository rep;
	//here the ProductRepository bean is going 
	//get injected (DI)
	public void setRep(ProductRepository rep) {
		System.out.println("setter of service");
		this.rep = rep;
	}
	
	public String getProducts() {
		return rep.getProducts();
	}
}