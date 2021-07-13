package com.yyww.mysql.jdbc.controller;

import com.yyww.mysql.jdbc.entity.Customer;
import com.yyww.mysql.jdbc.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Customer)表控制层
 *
 * @author makejava
 * @since 2021-07-13 15:49:00
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerService customerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Customer selectOne(Long id) {
        return this.customerService.queryById(id);
    }

}
