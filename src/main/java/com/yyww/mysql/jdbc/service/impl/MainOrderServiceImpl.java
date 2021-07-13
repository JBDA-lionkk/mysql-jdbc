package com.yyww.mysql.jdbc.service.impl;

import com.yyww.mysql.jdbc.entity.MainOrder;
import com.yyww.mysql.jdbc.dao.MainOrderDao;
import com.yyww.mysql.jdbc.service.MainOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MainOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
@Service("mainOrderService")
public class MainOrderServiceImpl implements MainOrderService {
    @Resource
    private MainOrderDao mainOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MainOrder queryById(Long id) {
        return this.mainOrderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<MainOrder> queryAllByLimit(int offset, int limit) {
        return this.mainOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mainOrder 实例对象
     * @return 实例对象
     */
    @Override
    public MainOrder insert(MainOrder mainOrder) {
        this.mainOrderDao.insert(mainOrder);
        return mainOrder;
    }

    /**
     * 修改数据
     *
     * @param mainOrder 实例对象
     * @return 实例对象
     */
    @Override
    public MainOrder update(MainOrder mainOrder) {
        this.mainOrderDao.update(mainOrder);
        return this.queryById(mainOrder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.mainOrderDao.deleteById(id) > 0;
    }
}
