package com.yyww.mysql.jdbc.dao;

import com.yyww.mysql.jdbc.entity.MainOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MainOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
public interface MainOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MainOrder queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MainOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param mainOrder 实例对象
     * @return 对象列表
     */
    List<MainOrder> queryAll(MainOrder mainOrder);

    /**
     * 新增数据
     *
     * @param mainOrder 实例对象
     * @return 影响行数
     */
    int insert(MainOrder mainOrder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MainOrder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MainOrder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MainOrder> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<MainOrder> entities);

    /**
     * 修改数据
     *
     * @param mainOrder 实例对象
     * @return 影响行数
     */
    int update(MainOrder mainOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

