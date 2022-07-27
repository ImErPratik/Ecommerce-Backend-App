package com.AlgoDomain.project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AlgoDomain.project.Model.Login;




@Repository
public interface LoginCrudRepo extends JpaRepository<Login, Integer> {
	
	public Optional<Login> findByLoginId(Integer loginId);
	
	public Optional<Login> findByApiKey(String apiKey);
	
	
}
