package com.imagegrafia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.model.Product;
import com.imagegrafia.service.ProductServiceInterface;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	@Qualifier("productService2")
	ProductServiceInterface psi;
	//@Qualifier("productService")
	
	
	
	@RequestMapping(value="/getproduct" ,method=RequestMethod.GET)
	public Product getProduct()
	{
		return psi.getProduct();
	}
	
}
