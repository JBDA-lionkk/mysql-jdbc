package com.yyww.mysql.jdbc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyww.mysql.jdbc.entity.DictionaryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Dictionary)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 15:50:04
 */
@Mapper
public interface DictionaryDao extends BaseMapper<DictionaryEntity> {



}

