package com.gurpreet.spring.springorm.product.dao;

import java.util.List;

import com.gurpreet.spring.springorm.product.entity.Product;

public interface ProductDao {
	int createProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Product product);
	Product findSingleProduct(int id);
	List<Product> findAllProducts();
}