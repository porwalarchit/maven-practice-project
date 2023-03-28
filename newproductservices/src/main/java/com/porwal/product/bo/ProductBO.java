package com.porwal.product.bo;

import com.porwal.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	Product findProduct(int id);
}
