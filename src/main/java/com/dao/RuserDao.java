package com.dao;

import com.entity.Ruser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Ruser)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
public interface RuserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Ruser queryById(Integer uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Ruser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ruser 实例对象
     * @return 对象列表
     */
    List<Ruser> queryAll(Ruser ruser);

    /**
     * 新增数据
     *
     * @param ruser 实例对象
     * @return 影响行数
     */
    int insert(Ruser ruser);

    /**
     * 修改数据
     *
     * @param ruser 实例对象
     * @return 影响行数
     */
    int update(Ruser ruser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(Integer uid);

}