package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.Product;

@Mapper
public interface ProductMapper {
	//create
	@Insert("insert into product(productno,productname,price) values(#{productno},#{productname},#{price})")
	void add(Product p);
	//read
	@Select("select * from product")
	List<Product> selectAll();
	@Select("select * from product where id=#{id}")
	Product selectById(int id);
	@Select("select * from product where productno=#{productno}")
	Product selectByNo(String productno);
	@Select("select * from product where productname=#{productname}")
	Product selectByProductname(String poductname);
	
	//update
	@Update("update product set"
			+ " productno=#{productno},productname=#{productname},price=#{price}"
			+ " where id=#{id}")
	void update(Product p);
	
	
	//delete
	@Delete("delete from product where id=#{id}")
	void deleteById(int id);
	
	

}
