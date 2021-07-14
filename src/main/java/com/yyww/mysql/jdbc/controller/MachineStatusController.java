package com.yyww.mysql.jdbc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mysql.cj.util.StringUtils;
import com.yyww.mysql.jdbc.entity.MachineStatusEntity;
import com.yyww.mysql.jdbc.service.MachineStatusService;
import com.yyww.mysql.jdbc.utils.JsonResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * 机器表
 *
 * @author makejava
 * @since 2021-07-13 15:50:24
 */
@RestController
@RequestMapping("machineStatus")
public class MachineStatusController {
    @Resource
    private MachineStatusService machineStatusService;

    /**
     * 添加
     */
    @PostMapping("/add")
    public JsonResponse<MachineStatusEntity> add(@RequestBody MachineStatusEntity machineStatusEntity){
        machineStatusEntity.setCreateTime(new Date());
        machineStatusEntity.setUpdateTime(new Date());
        String s = UUID.randomUUID().toString();
        String replace = s.replace("-", "");
        machineStatusEntity.setMacId(replace);
        machineStatusService.save(machineStatusEntity);
        return JsonResponse.ok();
    }

    @PostMapping("/update")
    public JsonResponse<MachineStatusEntity> update(@RequestBody MachineStatusEntity machineStatusEntity){
        if(machineStatusEntity.getId() != null){
            machineStatusService.updateById(machineStatusEntity);
        }
        return JsonResponse.ok();
    }

    @DeleteMapping("/delete")
    public JsonResponse<MachineStatusEntity> delete(@RequestBody List<Long> ids){
        machineStatusService.removeByIds(ids);
        return JsonResponse.ok();
    }

    @GetMapping("/select/{macId}")
    public JsonResponse<MachineStatusEntity> select(@PathVariable("macId") String macId){
        MachineStatusEntity one = machineStatusService.getOne(new QueryWrapper<MachineStatusEntity>().like("mac_id", macId));
        return JsonResponse.ok(one);
    }
}
