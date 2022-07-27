package com.AlgoDomain.project.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sellerid;
	
	private String sellerName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product_M> prod_list;

}
