package com.yyww.mysql.jdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yyww.mysql.jdbc.entity.CustomerEntity;
import com.yyww.mysql.jdbc.entity.MainOrderEntity;
import com.yyww.mysql.jdbc.service.CustomerService;
import com.yyww.mysql.jdbc.service.MainOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class MysqlJdbcApplicationTests {

    @Resource
    CustomerService customerService;

    @Resource
    private MainOrderService mainOrderService;

    @Test
    void contextLoads() {
    }

    @Test
    public void add(){
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setUsername("haha");
        customerEntity.setGender(1);
        customerEntity.setCreateTime(new Date());

        customerService.save(customerEntity);
    }

    @Test
    public void select(){
        MainOrderEntity orderEntity = new MainOrderEntity();
        orderEntity.setOrderId("2213");
        MainOrderEntity order_id = mainOrderService.getOne(new QueryWrapper<MainOrderEntity>().like("order_id", orderEntity.getOrderId()));
        System.out.println(order_id);
    }

    @Test
    public void select1(){
        CustomerEntity orderEntity = new CustomerEntity();
        orderEntity.setUsername("李");
        CustomerEntity username = customerService.getOne(new QueryWrapper<CustomerEntity>().like("username", orderEntity.getUsername()));
        System.out.println(username);
    }

}
