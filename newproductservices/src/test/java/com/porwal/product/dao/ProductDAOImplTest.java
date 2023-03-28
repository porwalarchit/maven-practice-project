package com.porwal.product.dao;
import com.porwal.product.dto.Product;
import static org.junit.Assert.*;

import org.junit.Test;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("IPhone");
		product.setDescription("Its Awesome");
		product.setPrice(800);
		
		dao.create(product);
		
		Product res = dao.read(1);
		
		assertNotNull(res);
		assertEquals("IPhone", res.getName());
	}

}