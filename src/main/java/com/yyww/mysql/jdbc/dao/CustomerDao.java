package com.yyww.mysql.jdbc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyww.mysql.jdbc.entity.CustomerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (Customer)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 15:48:56
 */
@Mapper
public interface CustomerDao extends BaseMapper<CustomerEntity> {

}

