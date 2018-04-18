package org.lostandfound.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lostandfound.entity.Lost;
import org.lostandfound.entity.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class LostDaoTest {
    @Resource
    private LostDao lostDao;
//    @Test
//    public void insertLost() {
//        String lostname="1";
//        String lostthings="1";
//        String lostplace="1";
//        String
//        String phone="1";
//        Lost lost = new Lost();
//        lost.setLostname(lostname);
//        lost.setLostthings(lostthings);
//        lost.setLostdate(new Date());
//        lost.setLostplace(lostplace);
//        lost.setPhone(phone);
//        lostDao.insertLost(lost);
//        System.out.println(lostDao.queryByLostthings(lostthings));
//        }
}