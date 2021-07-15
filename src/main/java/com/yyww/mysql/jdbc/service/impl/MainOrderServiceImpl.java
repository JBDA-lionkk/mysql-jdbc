package com.yyww.mysql.jdbc.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyww.mysql.jdbc.dao.MainOrderDao;
import com.yyww.mysql.jdbc.entity.MainOrderEntity;
import com.yyww.mysql.jdbc.service.MainOrderService;
import com.yyww.mysql.jdbc.vo.OrderPage;
import com.yyww.mysql.jdbc.vo.QueryOrderVo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * (MainOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
@Service("mainOrderService")
public class MainOrderServiceImpl extends ServiceImpl<MainOrderDao, MainOrderEntity> implements MainOrderService {

    @Override
    public IPage<OrderPage> queryPage(QueryOrderVo vo) {
        Page<MainOrderEntity> page = new Page<>(vo.getCurrent(),vo.getSize());
        return this.baseMapper.queryPage(page,vo);
    }

    @Override
    public void add(MainOrderEntity mainOrderEntity) {
        mainOrderEntity.setCreateTime(new Date());
        mainOrderEntity.setUpdateTime(new Date());
        String s = UUID.randomUUID().toString();
        String replace = s.replace("-", "");
        mainOrderEntity.setOrderId(replace);

        this.save(mainOrderEntity);
    }

    @Override
    public void removeByOrderIds(List<String> ids) {
        baseMapper.removeByOrderIds(ids);
    }
}
