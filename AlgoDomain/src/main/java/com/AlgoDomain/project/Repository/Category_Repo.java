package com.AlgoDomain.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AlgoDomain.project.Model.Customer;

@Repository
public interface Category_Repo extends JpaRepository<Customer, Integer> {

}
