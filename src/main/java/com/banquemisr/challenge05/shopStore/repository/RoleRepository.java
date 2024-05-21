package com.banquemisr.challenge05.shopStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banquemisr.challenge05.shopStore.model.ERole;
import com.banquemisr.challenge05.shopStore.model.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	 Optional<Role> findByName(ERole name);
}