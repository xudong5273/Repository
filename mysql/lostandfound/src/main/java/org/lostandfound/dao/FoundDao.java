package org.lostandfound.dao;

import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;

import java.util.List;

public interface FoundDao {
    List<Lost> queryByFoundthings(String foundthings);

    void insertFound(Found found);

}
