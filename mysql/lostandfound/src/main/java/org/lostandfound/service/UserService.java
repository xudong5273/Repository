package org.lostandfound.service;

import org.apache.ibatis.annotations.Param;
import org.lostandfound.entity.User;


public interface UserService {
//    void updateUser(String username,String password,String classes);

    String  register(User user);

    User login(String username,String password);
}
