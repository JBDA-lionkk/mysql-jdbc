package com.yyww.mysql.jdbc.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyww.mysql.jdbc.dao.MainOrderDao;
import com.yyww.mysql.jdbc.entity.MainOrderEntity;
import com.yyww.mysql.jdbc.service.MainOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (MainOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
@Service("mainOrderService")
public class MainOrderServiceImpl extends ServiceImpl<MainOrderDao, MainOrderEntity> implements MainOrderService {

}
