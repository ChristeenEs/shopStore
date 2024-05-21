package com.banquemisr.challenge05.shopStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banquemisr.challenge05.shopStore.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	   User findByUsername(String username);
	    Boolean existsByUsername(String username);
	    Boolean existsByEmail(String email);
    
}