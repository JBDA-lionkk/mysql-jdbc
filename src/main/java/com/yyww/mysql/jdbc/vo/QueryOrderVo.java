package com.yyww.mysql.jdbc.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class QueryOrderVo {
    /**
     * 页码
     */
    private Integer current;
    /**
     * 页数
     */
    private Integer size;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 商品编号
     */
    private String macId;
    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createStartTime;
    /**
     *结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createEndTime;

    private BigDecimal price;
}
