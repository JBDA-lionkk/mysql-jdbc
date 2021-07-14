package com.yyww.mysql.jdbc.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Customer)实体类
 *
 * @author makejava
 * @since 2021-07-13 15:48:54
 */
@Data
@TableName("customer")
public class CustomerEntity implements Serializable {
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
    @TableLogic
    @TableField(select = false)
    private Integer deleted = 0;

}
