package com.yyww.mysql.jdbc.controller;

import com.yyww.mysql.jdbc.entity.Dictionary;
import com.yyww.mysql.jdbc.service.DictionaryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Dictionary)表控制层
 *
 * @author makejava
 * @since 2021-07-13 15:50:05
 */
@RestController
@RequestMapping("dictionary")
public class DictionaryController {
    /**
     * 服务对象
     */
    @Resource
    private DictionaryService dictionaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dictionary selectOne(Long id) {
        return this.dictionaryService.queryById(id);
    }

}
