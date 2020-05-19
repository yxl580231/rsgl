package com.commons;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
    T queryById(Serializable id);
    List<T> queryAll(T t);
    int insert(T t);
    int update(T t);
    int delete(Serializable id);
}
