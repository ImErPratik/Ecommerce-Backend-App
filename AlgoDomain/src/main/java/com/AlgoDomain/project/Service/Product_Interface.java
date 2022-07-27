package com.AlgoDomain.project.Service;

import com.AlgoDomain.project.Model.Product_M;

public interface Product_Interface {
	
	public Product_M addProduct(Product_M product);
	
	public Product_M findProductByid(Integer id);

}
