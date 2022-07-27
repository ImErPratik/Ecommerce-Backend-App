package com.AlgoDomain.project.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.AlgoDomain.project.Model.Product_M;
import com.AlgoDomain.project.Service.Product_Interface;

@RestController
public class Product_Controller {
	
	private Product_Interface pro_S;
	
	@PostMapping("/algodomain/product")
	public ResponseEntity<Product_M> storeProduct(@RequestBody Product_M product){
		
		Product_M cm = pro_S.addProduct(product);
		
		return new ResponseEntity<Product_M>(cm, HttpStatus.OK);
	}

}
