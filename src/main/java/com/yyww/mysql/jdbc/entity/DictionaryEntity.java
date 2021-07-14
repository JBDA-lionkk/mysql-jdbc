package com.yyww.mysql.jdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Dictionary)实体类
 *
 * @author makejava
 * @since 2021-07-13 15:50:04
 */
@TableName("dictionary")
@Data
public class DictionaryEntity implements Serializable {
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

}
