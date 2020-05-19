package com.commons;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
    T queryById(Serializable id);
    List<T> queryAll(int pageNum,int pageSize, T t);
    boolean insert(T t);
    boolean update(T t);
    boolean delete(Serializable id);
}
