package com.IET.service;

import java.util.List;

import com.IET.beans.Product;

public interface ProductService {

	List<Product> getAllProduct();
	
	int addProduct(Product p);

	Product getById(int pid);

	int updateProduct(Product p);

	//int deleteById(int pid);

}
