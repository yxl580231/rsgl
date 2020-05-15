package com.service;

import com.entity.Doucument;
import java.util.List;

/**
 * (Doucument)表服务接口
 *
 * @author makejava
 * @since 2020-05-15 17:39:22
 */
public interface DoucumentService {

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    Doucument queryById(Integer did);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Doucument> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param doucument 实例对象
     * @return 实例对象
     */
    Doucument insert(Doucument doucument);

    /**
     * 修改数据
     *
     * @param doucument 实例对象
     * @return 实例对象
     */
    Doucument update(Doucument doucument);

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 是否成功
     */
    boolean deleteById(Integer did);

}