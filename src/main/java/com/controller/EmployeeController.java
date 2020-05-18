package com.controller;

import com.entity.Employee;
import com.github.pagehelper.PageInfo;
import com.service.EmployeeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employee)表控制层
 *
 * @author makejava
 * @since 2020-05-14 16:55:15
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employee selectOne(Integer id) {
        return this.employeeService.queryById(id);
    }

    public String selectAll(Model model, @RequestParam(required = false,defaultValue = "1") Integer pageNum,
                            @RequestParam(required = false,defaultValue = "5")Integer pageSize){
        PageInfo<Employee> pageInfo = new PageInfo<>(employeeService.queryAll(pageNum,pageSize));
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }
}