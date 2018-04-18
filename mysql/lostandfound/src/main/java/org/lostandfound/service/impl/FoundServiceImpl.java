package org.lostandfound.service.impl;

import org.lostandfound.dao.FoundDao;
import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.lostandfound.service.FoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FoundServiceImpl implements FoundService {

    @Autowired
    private FoundDao foundDao;

    public List<Lost> queryByFoundthings(String foundthings) {
        List<Lost> losts = foundDao.queryByFoundthings(foundthings);
        return losts;
    }

    public void  insertFound(Found found) {
            foundDao.insertFound(found);
    }

}
