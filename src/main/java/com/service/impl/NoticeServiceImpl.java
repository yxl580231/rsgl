package com.service.impl;

import com.commons.BaseServiceImpl;
import com.entity.Notice;
import com.dao.NoticeDao;
import com.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Notice)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 17:41:10
 */
@Service("noticeService")
public class NoticeServiceImpl extends BaseServiceImpl<Notice> implements NoticeService {
    @Autowired
    public void setBaseDao(NoticeDao noticeDao){
        super.baseDao=noticeDao;
    }
}