package com.IET.service;

import java.util.List;

import com.IET.beans.Product;
import com.IET.dao.ProductDao;
import com.IET.dao.ProductDaoImp;

public class ProductServiceImp implements ProductService{
	
	private ProductDao pdao;

	public ProductServiceImp() {
		pdao=new ProductDaoImp();
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pdao.AllProduct();
	}

	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.saveProduct(p);
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return pdao.findByI(pid);
	}

	@Override
	public int updateProduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.modifyProduct(p);
	}
	

}
