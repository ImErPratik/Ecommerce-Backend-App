package com.AlgoDomain.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AlgoDomain.project.Model.Product_M;

@Repository
public interface Product_Repo extends JpaRepository<Product_M, Integer> {

}
