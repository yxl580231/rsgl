package com.service;

import com.commons.BaseService;
import com.entity.Ruser;

/**
 * (Ruser)表服务接口
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
public interface RuserService extends BaseService<Ruser> {

    Ruser login(String loginname,String pwd);
}