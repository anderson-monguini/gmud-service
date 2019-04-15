package com.vivo.gmud.repository;

import com.vivo.gmud.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}