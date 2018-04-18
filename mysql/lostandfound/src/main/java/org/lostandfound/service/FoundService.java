package org.lostandfound.service;


import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FoundService {

    List<Lost> queryByFoundthings(String foundthings);

    void  insertFound(Found found);

}
