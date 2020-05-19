package com.service.impl;

import com.commons.BaseServiceImpl;
import com.entity.Ruser;
import com.dao.RuserDao;
import com.service.RuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Ruser)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
@Service("ruserService")
public class RuserServiceImpl extends BaseServiceImpl<Ruser> implements RuserService {

    @Autowired
    public void setBaseDao(RuserDao ruserDao){
        super.baseDao=ruserDao;
    }
    @Autowired
    RuserDao ruserDao;

    @Override
    public Ruser login(String loginname, String pwd) {
        return ruserDao.login(loginname,pwd);
    }

}