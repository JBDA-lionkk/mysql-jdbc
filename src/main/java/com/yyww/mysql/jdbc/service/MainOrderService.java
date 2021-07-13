package com.yyww.mysql.jdbc.service;

import com.yyww.mysql.jdbc.entity.MainOrder;

import java.util.List;

/**
 * (MainOrder)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
public interface MainOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MainOrder queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MainOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param mainOrder 实例对象
     * @return 实例对象
     */
    MainOrder insert(MainOrder mainOrder);

    /**
     * 修改数据
     *
     * @param mainOrder 实例对象
     * @return 实例对象
     */
    MainOrder update(MainOrder mainOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
