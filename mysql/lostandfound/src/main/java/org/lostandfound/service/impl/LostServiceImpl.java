package org.lostandfound.service.impl;

import org.lostandfound.dao.LostDao;
import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.lostandfound.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class LostServiceImpl implements LostService{

    @Autowired
    private LostDao LostDao;

    public List<Found> queryByLostthings(String lostthings) {
        List<Found> founds = LostDao.queryByLostthings(lostthings);
        return founds;
    }

    public void  insertLost(Lost lost) {
            LostDao.insertLost(lost);
    }
}
