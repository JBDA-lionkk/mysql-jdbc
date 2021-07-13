package com.yyww.mysql.jdbc.controller;

import com.yyww.mysql.jdbc.entity.MachineStatus;
import com.yyww.mysql.jdbc.service.MachineStatusService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MachineStatus)表控制层
 *
 * @author makejava
 * @since 2021-07-13 15:50:24
 */
@RestController
@RequestMapping("machineStatus")
public class MachineStatusController {
    /**
     * 服务对象
     */
    @Resource
    private MachineStatusService machineStatusService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MachineStatus selectOne(Long id) {
        return this.machineStatusService.queryById(id);
    }

}
