package com.spring.security.DAO;

public interface SecurityServiceDAO {

    String findLoggedInUsername();
    void autoLogin(String username, String password);

}
