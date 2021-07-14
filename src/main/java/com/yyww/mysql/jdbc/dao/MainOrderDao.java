package com.yyww.mysql.jdbc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yyww.mysql.jdbc.entity.MainOrderEntity;
import com.yyww.mysql.jdbc.vo.OrderPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MainOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
@Mapper
public interface MainOrderDao extends BaseMapper<MainOrderEntity> {
    IPage<OrderPage> queryPage();
}

