package com.yyww.mysql.jdbc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Customer)实体类
 *
 * @author makejava
 * @since 2021-07-13 15:48:54
 */
public class Customer implements Serializable {
    private static final long serialVersionUID = -55874475114589325L;
    /**
     * 用户id
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
     * 性别 0-女 1-男
     */
    private Integer gender;
    /**
     * 用户名
     */
    private String username;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}
