package com.vivo.gmud.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vivo.gmud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}