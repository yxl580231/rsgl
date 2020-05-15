package com.service.impl;

import com.entity.Doucument;
import com.dao.DoucumentDao;
import com.service.DoucumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Doucument)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 17:39:22
 */
@Service("doucumentService")
public class DoucumentServiceImpl implements DoucumentService {
    @Resource
    private DoucumentDao doucumentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param did 主键
     * @return 实例对象
     */
    @Override
    public Doucument queryById(Integer did) {
        return this.doucumentDao.queryById(did);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Doucument> queryAllByLimit(int offset, int limit) {
        return this.doucumentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param doucument 实例对象
     * @return 实例对象
     */
    @Override
    public Doucument insert(Doucument doucument) {
        this.doucumentDao.insert(doucument);
        return doucument;
    }

    /**
     * 修改数据
     *
     * @param doucument 实例对象
     * @return 实例对象
     */
    @Override
    public Doucument update(Doucument doucument) {
        this.doucumentDao.update(doucument);
        return this.queryById(doucument.getDid());
    }

    /**
     * 通过主键删除数据
     *
     * @param did 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer did) {
        return this.doucumentDao.deleteById(did) > 0;
    }
}