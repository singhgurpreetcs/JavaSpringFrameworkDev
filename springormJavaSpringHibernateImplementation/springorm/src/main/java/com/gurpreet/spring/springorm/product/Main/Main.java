package com.gurpreet.spring.springorm.product.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gurpreet.spring.springorm.product.dao.ProductDao;
import com.gurpreet.spring.springorm.product.entity.Product;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gurpreet/spring/springorm/product/Main/config.xml");

		ProductDao dao = (ProductDao) ctx.getBean("productdaoimplbean");

		Product product = new Product();

		product.setId(2);
		product.setName("IPHONE12");
		product.setDesc("IPHONE 12");
		product.setPrice(26500);

		// dao.createProduct(product);
		// dao.updateProduct(product);
		// dao.deleteProduct(product);
		//Product pro = dao.findSingleProduct(1);
		List<Product> products = dao.findAllProducts();
		System.out.println("Products:" + products);
	}

}
