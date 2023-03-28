package com.porwal.product.bo;

import com.porwal.product.dto.Product;
import com.porwal.product.dao.ProductDAO;
import com.porwal.product.dao.ProductDAOImpl;


public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
