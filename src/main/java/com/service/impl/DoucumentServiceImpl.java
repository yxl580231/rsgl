package com.service.impl;

import com.commons.BaseServiceImpl;
import com.entity.Doucument;
import com.dao.DoucumentDao;
import com.service.DoucumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Doucument)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 17:39:22
 */
@Service("doucumentService")
public class DoucumentServiceImpl extends BaseServiceImpl<Doucument> implements DoucumentService {
    @Autowired
    public void setBaseDao(DoucumentDao doucumentDao){
        super.baseDao=doucumentDao;
    }
}