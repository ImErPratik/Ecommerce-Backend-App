package com.AlgoDomain.project.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AlgoDomain.project.Exception.ItemUnavailable;
import com.AlgoDomain.project.Model.Product_M;
import com.AlgoDomain.project.Repository.Product_Repo;

@Service
public class Product_implement implements Product_Interface {
	
	@Autowired
	private Product_Repo pro_Repo;

	@Override
	public Product_M addProduct(Product_M product) {
		return pro_Repo.save(product);
	}

	@Override
	public Product_M findProductByid(Integer id) {
		Optional<Product_M> a =  pro_Repo.findById(id);
		
		if(a.isPresent()) {
			return a.get();
		}
		
		throw new ItemUnavailable("item Not found");
	}

}
