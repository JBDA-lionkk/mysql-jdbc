package com.yyww.mysql.jdbc.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderPage {
    /**
     * 订单Id
     */
    private String orderId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 用户名
     */
    private String username;
    /**
     *
     */
    private String macId;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 价格
     */
    private BigDecimal price;
}
