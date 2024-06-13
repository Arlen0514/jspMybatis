package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.impl.ProductServiceImpl;
import com.example.demo.vo.Product;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ProductController {//jsp網頁所有功能只能透過controller連接使用
	@Autowired
	ProductServiceImpl psi;
	
	@GetMapping("addProduct")
	public String gotAddProduct()
	{
		return "addProduct";
	}
	@GetMapping("queryProduct")
	public String gotQueryProduct(HttpSession session)//jsp無法不捉bean,要用session
	{
		String show=psi.queryAll2();
		session.setAttribute("SHOW", show);
		
		return "queryProduct";
	}
	@GetMapping("updateProduct")
	public String gotoupdateProduct()
	{
		return "updateProduct";
	}
	@GetMapping("deleteProduct")
	public String gotDeleteProduct()
	{
		return "deleteProduct";
	}
	@GetMapping("product")
	public void gotoProduct(HttpServletResponse response)
	{
		try {
			response.sendRedirect("product.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@PostMapping("add")
	public void  add(String productno,String productname,int price,HttpServletResponse response)
	{
		//int Price=Integer.parseInt(price);若上面price為String可轉型
		psi.addProduct(new Product(productno,productname,price));
		try {
			response.sendRedirect("product.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@GetMapping("delete")
	public void delete(int id,HttpServletResponse response)
	{
		psi.deleteProduct(id);
		
		try {
			response.sendRedirect("product.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@PostMapping("update")
	public void update(int id,String productname,int price,HttpServletResponse response)
	{
		psi.updateProduct(id, productname, price);
		try {
			response.sendRedirect("product.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}