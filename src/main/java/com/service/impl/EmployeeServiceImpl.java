package com.service.impl;

import com.commons.BaseServiceImpl;
import com.entity.Employee;
import com.dao.EmployeeDao;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Employee)表服务实现类
 *
 * @author makejava
 * @since 2020-05-14 16:55:14
 */
@Service("employeeService")
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements EmployeeService {
    @Autowired
    public void setBaseDao(EmployeeDao employeeDao){
        super.baseDao=employeeDao;
    }
}