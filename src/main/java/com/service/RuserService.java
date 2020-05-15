package com.service;

import com.entity.Ruser;
import java.util.List;

/**
 * (Ruser)表服务接口
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
public interface RuserService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Ruser queryById(Integer uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Ruser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ruser 实例对象
     * @return 实例对象
     */
    Ruser insert(Ruser ruser);

    /**
     * 修改数据
     *
     * @param ruser 实例对象
     * @return 实例对象
     */
    Ruser update(Ruser ruser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uid);

}