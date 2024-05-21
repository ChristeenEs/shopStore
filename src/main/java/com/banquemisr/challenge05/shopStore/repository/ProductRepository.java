package com.banquemisr.challenge05.shopStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banquemisr.challenge05.shopStore.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
