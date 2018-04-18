package org.lostandfound.dao;

import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface LostDao {

    List<Found> queryByLostthings(String lostthings);

    void insertLost(Lost lost);
}
