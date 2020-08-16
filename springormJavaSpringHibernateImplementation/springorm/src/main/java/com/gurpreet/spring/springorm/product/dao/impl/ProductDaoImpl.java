package com.gurpreet.spring.springorm.product.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gurpreet.spring.springorm.product.dao.ProductDao;
import com.gurpreet.spring.springorm.product.entity.Product;

@Component("productdaoimplbean")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	// Add the transactional annotation to commit as a transaction
	@Override
	@Transactional
	public int createProduct(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void deleteProduct(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	public Product findSingleProduct(int id) {
		Product pro = hibernateTemplate.get(Product.class, id);
		return pro;
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> pros = hibernateTemplate.loadAll(Product.class);
		return pros;
	}

}
