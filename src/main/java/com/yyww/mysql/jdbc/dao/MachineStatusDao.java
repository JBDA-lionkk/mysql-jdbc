package com.yyww.mysql.jdbc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyww.mysql.jdbc.entity.MachineStatusEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MachineStatus)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 15:50:23
 */
@Mapper
public interface MachineStatusDao extends BaseMapper<MachineStatusEntity> {



}

