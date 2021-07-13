package com.yyww.mysql.jdbc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Dictionary)实体类
 *
 * @author makejava
 * @since 2021-07-13 15:50:04
 */
public class Dictionary implements Serializable {
    private static final long serialVersionUID = 551964874691749382L;
    /**
     * 字典id
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
     * 类型
     */
    private String type;
    /**
     * 变量
     */
    private String code;
    /**
     * 值
     */
    private Integer value;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
