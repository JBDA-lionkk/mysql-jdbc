package com.yyww.mysql.jdbc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yyww.mysql.jdbc.entity.MainOrderEntity;
import com.yyww.mysql.jdbc.service.MainOrderService;
import com.yyww.mysql.jdbc.utils.JsonResponse;
import com.yyww.mysql.jdbc.vo.QueryOrderVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * (MainOrder)表控制层
 *
 * @author makejava
 * @since 2021-07-13 15:50:39
 */
@RestController
@RequestMapping("mainOrder")
public class MainOrderController {
    @Resource
    private MainOrderService mainOrderService;

    //添加订单
    @PostMapping("/add")
    public JsonResponse<MainOrderEntity> addOrder(@RequestBody MainOrderEntity mainOrderEntity) {
        mainOrderEntity.setCreateTime(new Date());
        mainOrderEntity.setUpdateTime(new Date());
        String s = UUID.randomUUID().toString();
        String replace = s.replace("-", "");
        mainOrderEntity.setOrderId(replace);
        mainOrderService.save(mainOrderEntity);
        return JsonResponse.ok();
    }

    //修改订单
    @PostMapping("/update")
    public JsonResponse<MainOrderEntity> updateOrder(@RequestBody MainOrderEntity entity) {
        if (entity.getId() != null) {
            mainOrderService.updateById(entity);
        }
        return JsonResponse.ok();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete")
    public JsonResponse<MainOrderEntity> deleteOrder(@RequestBody List<Long> ids) {
        mainOrderService.removeByIds(ids);
        return JsonResponse.ok();
    }

    @PostMapping("page")
    public JsonResponse page(@RequestBody QueryOrderVo vo) {
//        mainOrderService.queryPage(vo);

        return JsonResponse.ok();
    }

}
