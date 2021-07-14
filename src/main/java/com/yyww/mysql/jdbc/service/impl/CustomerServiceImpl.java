package com.yyww.mysql.jdbc.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyww.mysql.jdbc.dao.CustomerDao;
import com.yyww.mysql.jdbc.entity.CustomerEntity;
import com.yyww.mysql.jdbc.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * (Customer)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 15:48:59
 */
@Service("customerService")
public class CustomerServiceImpl extends ServiceImpl<CustomerDao,CustomerEntity> implements CustomerService{

}
