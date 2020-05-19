package com.service.impl;

import com.commons.BaseServiceImpl;
import com.entity.Dept;
import com.dao.DeptDao;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * (Dept)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 17:39:08
 */
@Service("deptService")
public class DeptServiceImpl extends BaseServiceImpl<Dept> implements DeptService {
   @Autowired
    public void setBaseDao(DeptDao deptDao){
       super.baseDao=deptDao;
   }
}