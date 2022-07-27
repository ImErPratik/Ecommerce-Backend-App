package com.AlgoDomain.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId; 
	
   
	private String name;
	
    private String email;
    
    private String password;
    
    private String accessToken;
    
    private String created;


}
