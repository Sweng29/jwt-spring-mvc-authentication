package com.spring.security.DAO;

import com.spring.security.model.User;

public interface UserLoginDAO {

    void save(User user);

    User findByUsername(String username);

}
