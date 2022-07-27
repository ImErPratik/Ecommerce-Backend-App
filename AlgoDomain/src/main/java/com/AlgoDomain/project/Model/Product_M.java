package com.AlgoDomain.project.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Product_M {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	
	@NonNull
	private String name;
	
	private String discription;
	
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Seller seller;

}
