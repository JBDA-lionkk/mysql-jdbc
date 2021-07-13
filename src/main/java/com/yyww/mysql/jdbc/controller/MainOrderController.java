package com.yyww.mysql.jdbc.controller;

import com.yyww.mysql.jdbc.entity.MainOrder;
import com.yyww.mysql.jdbc.service.MainOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MainOrder)表控制层
 *
 * @author makejava
 * @since 2021-07-13 15:50:39
 */
@RestController
@RequestMapping("mainOrder")
public class MainOrderController {
    /**
     * 服务对象
     */
    @Resource
    private MainOrderService mainOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MainOrder selectOne(Long id) {
        return this.mainOrderService.queryById(id);
    }

}
