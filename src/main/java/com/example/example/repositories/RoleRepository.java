package com.example.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.example.entities.ERole;
import com.example.example.entities.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role,Integer>{
   Optional<Role> findByName(ERole name);    
} 