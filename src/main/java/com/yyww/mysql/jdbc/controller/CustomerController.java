package com.yyww.mysql.jdbc.controller;

import com.yyww.mysql.jdbc.entity.CustomerEntity;
import com.yyww.mysql.jdbc.service.CustomerService;
import com.yyww.mysql.jdbc.utils.JsonResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * (Customer)表控制层
 *
 * @author makejava
 * @since 2021-07-13 15:49:00
 */
@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;


    /**
     * 添加
     */
    @PostMapping("/add")
    public JsonResponse<CustomerEntity> add(@RequestBody CustomerEntity customerEntity) {
        customerEntity.setCreateTime(new Date());
        customerEntity.setUpdateTime(new Date());
        customerService.save(customerEntity);
        return JsonResponse.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public JsonResponse<CustomerEntity> update(@RequestBody CustomerEntity customerEntity) {
        if (customerEntity.getId() != null) {
            customerService.updateById(customerEntity);
        }
        return JsonResponse.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public JsonResponse<CustomerEntity> delete(@RequestBody List<Long> ids) {
        customerService.removeByIds(ids);
        return JsonResponse.ok();
    }

    /**
     * 获取全部信息
     */
    @GetMapping("/selectAll")
    public JsonResponse<CustomerEntity> selectAll() {
        List<CustomerEntity> list = customerService.list(null);
        for (CustomerEntity customerEntity : list) {
            return JsonResponse.ok(customerEntity);
        }
        return null;
    }

    @GetMapping("select")
    public JsonResponse<CustomerEntity> select(Long id) {
        CustomerEntity byId = customerService.getById(id);
        return JsonResponse.ok(byId);
    }


//    @GetMapping("/selectAll")
//    public JsonResponse<CustomerEntity> selectAll(){
//        Page<CustomerEntity> page = new Page<>(2,2);
//        Page<CustomerEntity> selectPage = customerDao.selectPage(page, null);
//        List<CustomerEntity> list = selectPage.getRecords();
//        for (CustomerEntity customerEntity : list) {
//            return JsonResponse.ok(customerEntity);
//        }
//        return null;
//    }


}
