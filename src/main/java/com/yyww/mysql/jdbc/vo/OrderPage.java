package com.yyww.mysql.jdbc.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderPage {
    private String orderId;
    private Date createTime;
    private String username;
    private String macId;
    private Integer gender;
    private BigDecimal price;
}
