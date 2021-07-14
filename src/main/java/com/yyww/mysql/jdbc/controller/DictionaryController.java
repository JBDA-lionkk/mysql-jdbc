package com.yyww.mysql.jdbc.controller;

import com.yyww.mysql.jdbc.entity.DictionaryEntity;
import com.yyww.mysql.jdbc.service.DictionaryService;
import com.yyww.mysql.jdbc.utils.JsonResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * (Dictionary)表控制层
 *
 * @author makejava
 * @since 2021-07-13 15:50:05
 */
@RestController
@RequestMapping("dictionary")
public class DictionaryController {

    @Resource
    private DictionaryService dictionaryService;

    /**
     * 添加数据
     */
    @PostMapping("/add")
    public JsonResponse<DictionaryEntity> add(@RequestBody DictionaryEntity dictionaryEntity){
        dictionaryEntity.setCreateTime(new Date());
        dictionaryEntity.setUpdateTime(new Date());
        dictionaryService.save(dictionaryEntity);
        return JsonResponse.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public JsonResponse<DictionaryEntity> update(@RequestBody DictionaryEntity dictionaryEntity){
        if (dictionaryEntity.getId() != null){
            dictionaryService.updateById(dictionaryEntity);
        }
        return JsonResponse.ok();
    }

    @DeleteMapping("/delete")
    public JsonResponse<DictionaryEntity> delete(@RequestBody List<Long> ids){
        dictionaryService.removeByIds(ids);
        return JsonResponse.ok();
    }


}
