package com.warrior.dao;

import java.util.List;

/**
 * Created by alexey_n on 23.08.2016.
 */
public interface BaseDao<T> {

    T getById(int id);

    List<T> getAll();

}
