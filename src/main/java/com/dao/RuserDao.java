package com.dao;

import com.commons.BaseDao;
import com.entity.Ruser;
import org.apache.ibatis.annotations.Param;

/**
 * (Ruser)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
public interface RuserDao extends BaseDao<Ruser> {

    Ruser login(@Param("loginname") String loginname,@Param("pwd") String pwd);
}