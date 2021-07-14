package com.yyww.mysql.jdbc.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyww.mysql.jdbc.dao.MachineStatusDao;
import com.yyww.mysql.jdbc.entity.MachineStatusEntity;
import com.yyww.mysql.jdbc.service.MachineStatusService;
import org.springframework.stereotype.Service;

/**
 * (MachineStatus)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 15:50:24
 */
@Service("machineStatusService")
public class MachineStatusServiceImpl extends ServiceImpl<MachineStatusDao, MachineStatusEntity> implements MachineStatusService {

}
