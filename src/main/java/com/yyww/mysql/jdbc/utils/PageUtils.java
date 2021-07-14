package com.yyww.mysql.jdbc.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageUtils implements Serializable {
    /**
     * 总的记录条数
     */
    private int totalRecord;

    /**
     * 记录列表
     */
    private List<?> records;
    /**
     * 页码
     */
    private int pageNo = 1;

    /**
     * 每页显示长度
     */
    private int pageSize = 10;

    /**
     * 分页开始
     */
    private String start;

    /**
     * 分页结束
     */
    private String end;
}
