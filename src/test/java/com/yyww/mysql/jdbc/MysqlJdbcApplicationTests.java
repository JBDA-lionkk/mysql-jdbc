package com.yyww.mysql.jdbc;

import com.yyww.mysql.jdbc.entity.CustomerEntity;
import com.yyww.mysql.jdbc.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class MysqlJdbcApplicationTests {

    @Resource
    CustomerService customerService;
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

}
