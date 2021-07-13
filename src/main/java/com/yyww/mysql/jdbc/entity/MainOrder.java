package com.yyww.mysql.jdbc.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * (MainOrder)实体类
 *
 * @author makejava
 * @since 2021-07-13 15:50:38
 */
public class MainOrder implements Serializable {
    private static final long serialVersionUID = 945945631477444465L;
    /**
     * id
     */
    private Long id;
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
    private Integer deleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}
