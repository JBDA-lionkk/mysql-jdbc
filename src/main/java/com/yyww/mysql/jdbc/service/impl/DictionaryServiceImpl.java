package com.yyww.mysql.jdbc.service.impl;

import com.yyww.mysql.jdbc.entity.Dictionary;
import com.yyww.mysql.jdbc.dao.DictionaryDao;
import com.yyww.mysql.jdbc.service.DictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dictionary)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 15:50:05
 */
@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {
    @Resource
    private DictionaryDao dictionaryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dictionary queryById(Long id) {
        return this.dictionaryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Dictionary> queryAllByLimit(int offset, int limit) {
        return this.dictionaryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dictionary 实例对象
     * @return 实例对象
     */
    @Override
    public Dictionary insert(Dictionary dictionary) {
        this.dictionaryDao.insert(dictionary);
        return dictionary;
    }

    /**
     * 修改数据
     *
     * @param dictionary 实例对象
     * @return 实例对象
     */
    @Override
    public Dictionary update(Dictionary dictionary) {
        this.dictionaryDao.update(dictionary);
        return this.queryById(dictionary.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.dictionaryDao.deleteById(id) > 0;
    }
}
