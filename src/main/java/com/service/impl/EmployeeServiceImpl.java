package com.service.impl;

import com.entity.Employee;
import com.dao.EmployeeDao;
import com.github.pagehelper.PageHelper;
import com.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Employee)表服务实现类
 *
 * @author makejava
 * @since 2020-05-14 16:55:14
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param eid 主键
     * @return 实例对象
     */
    @Override
    public Employee queryById(Integer eid) {
        return this.employeeDao.queryById(eid);
    }

    /**
     * 查询多条数据
     *
     * @param pageNum 查询页码数
     * @param pageSize 查询条数
     * @return 对象列表
     */
    @Override
    public List<Employee> queryAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return this.employeeDao.queryAll(new Employee());
    }

    /**
     * 新增数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    @Override
    public Employee insert(Employee employee) {
        this.employeeDao.insert(employee);
        return employee;
    }

    /**
     * 修改数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    @Override
    public Employee update(Employee employee) {
        this.employeeDao.update(employee);
        return this.queryById(employee.getEid());
    }

    /**
     * 通过主键删除数据
     *
     * @param eid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer eid) {
        return this.employeeDao.deleteById(eid) > 0;
    }
}