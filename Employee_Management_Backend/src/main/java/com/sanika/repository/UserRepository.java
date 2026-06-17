package com.sanika.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanika.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
  Optional<User> findByUsername(String username);
}
