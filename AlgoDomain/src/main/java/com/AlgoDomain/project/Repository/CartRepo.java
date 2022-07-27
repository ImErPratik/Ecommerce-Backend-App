package com.AlgoDomain.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AlgoDomain.project.Model.Cart;



@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

}
