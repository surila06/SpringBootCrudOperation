package com.imagegrafia.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.imagegrafia.model.Product;
@Service
@Primary
public class ProductService implements ProductServiceInterface {
	
	
	public Product getProduct()
	{
		return new Product(1,"Product1",200);
	}

}
