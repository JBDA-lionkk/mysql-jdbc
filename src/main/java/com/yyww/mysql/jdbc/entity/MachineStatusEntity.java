package com.yyww.mysql.jdbc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * (MachineStatus)实体类
 *
 * @author makejava
 * @since 2021-07-13 15:50:23
 */
@Data
@TableName("machine_status")
public class MachineStatusEntity implements Serializable {
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
    @TableLogic
    @TableField(select = false)
    private Integer deleted = 0;
}
