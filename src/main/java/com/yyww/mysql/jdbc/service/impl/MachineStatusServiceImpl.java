package com.yyww.mysql.jdbc.service.impl;

import com.yyww.mysql.jdbc.entity.MachineStatus;
import com.yyww.mysql.jdbc.dao.MachineStatusDao;
import com.yyww.mysql.jdbc.service.MachineStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MachineStatus)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 15:50:24
 */
@Service("machineStatusService")
public class MachineStatusServiceImpl implements MachineStatusService {
    @Resource
    private MachineStatusDao machineStatusDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MachineStatus queryById(Long id) {
        return this.machineStatusDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<MachineStatus> queryAllByLimit(int offset, int limit) {
        return this.machineStatusDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param machineStatus 实例对象
     * @return 实例对象
     */
    @Override
    public MachineStatus insert(MachineStatus machineStatus) {
        this.machineStatusDao.insert(machineStatus);
        return machineStatus;
    }

    /**
     * 修改数据
     *
     * @param machineStatus 实例对象
     * @return 实例对象
     */
    @Override
    public MachineStatus update(MachineStatus machineStatus) {
        this.machineStatusDao.update(machineStatus);
        return this.queryById(machineStatus.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.machineStatusDao.deleteById(id) > 0;
    }
}
