package com.controller;

import com.entity.Doucument;
import com.service.DoucumentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Doucument)表控制层
 *
 * @author makejava
 * @since 2020-05-15 17:39:22
 */
@RestController
@RequestMapping("doucument")
public class DoucumentController {
    /**
     * 服务对象
     */
    @Resource
    private DoucumentService doucumentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Doucument selectOne(Integer id) {
        return this.doucumentService.queryById(id);
    }

}