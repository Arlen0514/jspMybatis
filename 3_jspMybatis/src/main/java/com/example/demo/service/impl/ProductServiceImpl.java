package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import com.example.demo.vo.Product;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductMapper pm;

	@Override
	public void addProduct(Product p) {
		pm.add(p);	
	}

	@Override
	public List<Product> queryAll() {
		
		return pm.selectAll();
	}

	@Override
	public String queryAll2() {
		String show=" ";
		List<Product> l=queryAll();
		for(Product p:l)
		{
			show=show+"<tr><td>"+p.getId()+"<td>"+p.getProductno()
                                  +"<td>"+p.getProductname()
                                 +"<td>"+p.getPrice();
			
		}
		return show;
	}

	@Override
	public Product queryById(int id) {
		// TODO Auto-generated method stub
		return pm.selectById(id);
	}

	@Override
	public Product queryByProductno(String productno) {
		// TODO Auto-generated method stub
		return pm.selectByNo(productno);
	}

	@Override
	public Product queryByProductname(String productname) {
		// TODO Auto-generated method stub
		return pm.selectByProductname(productname);
	}

	@Override
	public void updateProduct(int id, String productno, String productname, int price) {
		Product p=queryById(id);
		p.setProductno(productno);
		p.setProductname(productname);
		p.setPrice(price);
		pm.update(p);
		
	}
	
	@Override
	public void updateProduct(int id, String productname, int price) {
		Product p=queryById(id);
		p.setProductname(productname);
		p.setPrice(price);
		
		
		pm.update(p);
		
	}

	@Override
	public void deleteProduct(int id) {
		pm.deleteById(id);
		
	}
	
	

}
