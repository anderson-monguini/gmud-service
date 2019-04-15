package com.vivo.gmud.repository;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
