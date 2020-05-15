package com.service.impl;

import com.entity.Ruser;
import com.dao.RuserDao;
import com.service.RuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Ruser)表服务实现类
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
@Service("ruserService")
public class RuserServiceImpl implements RuserService {
    @Resource
    private RuserDao ruserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Ruser queryById(Integer uid) {
        return this.ruserDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Ruser> queryAllByLimit(int offset, int limit) {
        return this.ruserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ruser 实例对象
     * @return 实例对象
     */
    @Override
    public Ruser insert(Ruser ruser) {
        this.ruserDao.insert(ruser);
        return ruser;
    }

    /**
     * 修改数据
     *
     * @param ruser 实例对象
     * @return 实例对象
     */
    @Override
    public Ruser update(Ruser ruser) {
        this.ruserDao.update(ruser);
        return this.queryById(ruser.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uid) {
        return this.ruserDao.deleteById(uid) > 0;
    }
}