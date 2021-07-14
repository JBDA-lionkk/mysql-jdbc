package com.yyww.mysql.jdbc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * (MainOrder)实体类
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
@Data
@TableName("main_order")
public class MainOrderEntity implements Serializable {
    private static final long serialVersionUID = 945945631477444465L;
    /**
     * id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 商品id
     */
    private String macId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 0-未删除 1-已删除
     */
    @TableLogic
    @TableField(select = false)
    private Integer deleted = 0;

}
