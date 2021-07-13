package com.yyww.mysql.jdbc.dao;

import com.yyww.mysql.jdbc.entity.MachineStatus;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MachineStatus)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 15:50:23
 */
public interface MachineStatusDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MachineStatus queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MachineStatus> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param machineStatus 实例对象
     * @return 对象列表
     */
    List<MachineStatus> queryAll(MachineStatus machineStatus);

    /**
     * 新增数据
     *
     * @param machineStatus 实例对象
     * @return 影响行数
     */
    int insert(MachineStatus machineStatus);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MachineStatus> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MachineStatus> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MachineStatus> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<MachineStatus> entities);

    /**
     * 修改数据
     *
     * @param machineStatus 实例对象
     * @return 影响行数
     */
    int update(MachineStatus machineStatus);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

