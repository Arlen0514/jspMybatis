package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Product;

public interface ProductService {
	void addProduct(Product p);
	
	List<Product> queryAll();
	String queryAll2();
	Product queryById(int id);
	Product queryByProductno(String productno);
	Product queryByProductname(String productname);
	
	void updateProduct(int id,String productno,String productname,int price);
	void updateProduct(int id,String productname,int price);
	
	void deleteProduct(int id);

}
