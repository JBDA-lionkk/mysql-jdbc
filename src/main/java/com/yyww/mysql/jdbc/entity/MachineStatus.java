package com.yyww.mysql.jdbc.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * (MachineStatus)实体类
 *
 * @author makejava
 * @since 2021-07-13 15:50:23
 */
public class MachineStatus implements Serializable {
    private static final long serialVersionUID = -33957266909165555L;
    /**
     * id
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 机器编号
     */
    private String macId;
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

    public String getMacId() {
        return macId;
    }

    public void setMacId(String macId) {
        this.macId = macId;
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
