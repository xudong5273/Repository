package org.lostandfound.service.impl;
import org.apache.ibatis.annotations.Param;
import org.lostandfound.dao.UserDao;
import org.lostandfound.entity.User;
import org.lostandfound.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

//    public void updateUser(String username,String password,String phone){
//
//    }

    public String register(User user){
        User u=userDao.queryByUsername(user.getUsername());
        if(u==null){
            userDao.insertUser(user);
            return "success";
        }else{
            return "error";
        }
    }

    public User login(String username, String password){
        User user=userDao.queryByUsername(username);
        if(user!=null&&user.getPassword().equals(password)){
            return user;
        }else{
            return  null;
        }
    }



}
