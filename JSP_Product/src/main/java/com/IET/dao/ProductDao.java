package com.IET.dao;

import java.util.List;

import com.IET.beans.Product;

public interface ProductDao {

	List<Product> AllProduct();

	
	int saveProduct(Product p);


	Product findByI(int pid);


	int modifyProduct(Product p);
}
