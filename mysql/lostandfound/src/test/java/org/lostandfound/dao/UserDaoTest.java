package org.lostandfound.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lostandfound.entity.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;
    @Test
    public void queryAll() {
        //List<User> users = userDao.queryAll();
        //System.out.println(users);
    }

    @Test
    public void queryByUsername(){
        String username="123";
        User user = userDao.queryByUsername(username);
        System.out.println(user);
    }

    @Test
    public void insertUser(){
        String username="1234";
        String password="1";
        String phone="1";
        //userDao.insertUser(user);
    }

    @Test
    public void upadateUser(){
        String username="123";
        String password="1111";
        String phone="1";
       // userDao.updateUser(username,password,phone);
    }
}