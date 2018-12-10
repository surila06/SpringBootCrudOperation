package com.imagegrafia.service;

import org.springframework.stereotype.Service;

import com.imagegrafia.model.Product;
@Service
public class ProductService2 implements ProductServiceInterface {
	
	
	public Product getProduct()
	{
		return new Product(2,"Product2",4000);
	}

}
