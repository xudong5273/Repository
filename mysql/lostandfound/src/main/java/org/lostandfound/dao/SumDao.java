package org.lostandfound.dao;

import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;

import java.util.List;
import java.util.Set;

public interface SumDao {
    List<Lost> queryLost();

    List<Found> queryFound();
}
