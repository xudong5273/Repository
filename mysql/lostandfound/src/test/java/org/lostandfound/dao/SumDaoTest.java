package org.lostandfound.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SumDaoTest {

    @Autowired
    private SumDao sumDao;

    @Test
    public void queryLost(){
        List<Lost> losts = sumDao.queryLost();
        System.out.println(losts);
    }

    @Test
    public void queryFound(){
        List<Found> founds = sumDao.queryFound();
        System.out.println(founds);
    }

}