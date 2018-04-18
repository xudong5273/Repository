package org.lostandfound.dao;

import org.lostandfound.entity.User;

import java.util.List;

public interface UserDao {
    User queryByUsername(String username);

    void insertUser(User user);

    //void updateUser(String username,String password,String classes);

    //List<User> queryAll();
}
