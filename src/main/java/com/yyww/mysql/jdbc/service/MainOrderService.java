package com.yyww.mysql.jdbc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yyww.mysql.jdbc.entity.MainOrderEntity;
import com.yyww.mysql.jdbc.vo.OrderPage;
import com.yyww.mysql.jdbc.vo.QueryOrderVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MainOrder)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
public interface MainOrderService extends IService<MainOrderEntity> {
    IPage<OrderPage> queryPage(QueryOrderVo vo);

    void add(@Param("mainOrderEntity") MainOrderEntity mainOrderEntity);

    void removeByOrderIds(List<String> ids);
}
