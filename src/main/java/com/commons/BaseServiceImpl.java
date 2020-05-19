package com.commons;

import com.github.pagehelper.PageHelper;

import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {

    protected BaseDao baseDao;

    @Override
    public T queryById(Serializable id) {
        return (T)baseDao.queryById(id);
    }

    @Override
    public List<T> queryAll(int pageNum,int pageSize,T t) {
        PageHelper.startPage(pageNum,pageSize);
        return baseDao.queryAll(t);
    }

    @Override
    public boolean insert(T t) {
        if(baseDao.insert(t)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(T t) {
        if(baseDao.update(t)>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Serializable id) {
        if(baseDao.delete(id)>0){
            return true;
        }
        return false;
    }
}
