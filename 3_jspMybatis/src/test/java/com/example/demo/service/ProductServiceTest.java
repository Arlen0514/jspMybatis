package com.example.demo.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.impl.ProductServiceImpl;
import com.example.demo.vo.Product;

@SpringBootTest
public class ProductServiceTest {
	@Autowired
	ProductServiceImpl psi;
	//@Test
	public void addProductTest()
	{
		psi.addProduct(new Product("p003","ruler",50));
		System.out.println("新增成功");
	}
	//@Test
	public void QueryAllTest()
	{
		List<Product> l=psi.queryAll();
		for(Product p:l)
		{
			System.out.println(p.getId()+"\t"+p.getProductname());
		}
	}
	//@Test 
	public void queryByIdTest()
	{
		System.out.println(psi.queryByProductno("p001"));
		
	}
	@Test
	public void updateProduct()
	{
		psi.updateProduct(1, "p001","lcd" , 1000);
		System.out.println("更改成功");
		
	}

}
