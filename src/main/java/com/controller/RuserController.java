package com.controller;

import com.entity.Ruser;
import com.service.RuserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Ruser)表控制层
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
@Controller
@RequestMapping("ruser")
public class RuserController {
    /**
     * 服务对象
     */
    @Resource
    private RuserService ruserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Ruser selectOne(Integer id) {
        return this.ruserService.queryById(id);
    }

    @RequestMapping("login")
    public String login(String loginname,String pwd){
        if(ruserService.login(loginname,pwd) != null) {
            return "back";
        }
        return "";
    }

}