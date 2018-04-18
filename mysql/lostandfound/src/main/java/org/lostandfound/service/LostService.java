package org.lostandfound.service;

import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LostService {

    List<Found> queryByLostthings(String lostthings);

    void insertLost(Lost lost);

}
