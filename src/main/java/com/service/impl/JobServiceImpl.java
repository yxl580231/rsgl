package com.service.impl;

import com.commons.BaseServiceImpl;
import com.entity.Job;
import com.dao.JobDao;
import com.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Job)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 17:40:35
 */
@Service("jobService")
public class JobServiceImpl extends BaseServiceImpl<Job> implements JobService {
    @Autowired
    public void setBaseDao(JobDao jobDao){
        super.baseDao=jobDao;
    }
}