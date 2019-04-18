package com.vivo.gmud.repository;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.vivo.gmud.model.User;
import com.vivo.gmud.web.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);

    void updatePassword(String password, Long userId);
}