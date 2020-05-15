package com.dao;

import com.entity.Doucument;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Doucument)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-15 17:39:22
 */
public interface DoucumentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    Doucument queryById(Integer did);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Doucument> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param doucument 实例对象
     * @return 对象列表
     */
    List<Doucument> queryAll(Doucument doucument);

    /**
     * 新增数据
     *
     * @param doucument 实例对象
     * @return 影响行数
     */
    int insert(Doucument doucument);

    /**
     * 修改数据
     *
     * @param doucument 实例对象
     * @return 影响行数
     */
    int update(Doucument doucument);

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 影响行数
     */
    int deleteById(Integer did);

}