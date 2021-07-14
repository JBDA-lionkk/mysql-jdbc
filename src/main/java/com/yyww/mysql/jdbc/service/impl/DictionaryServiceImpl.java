package com.yyww.mysql.jdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyww.mysql.jdbc.entity.DictionaryEntity;
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
public class DictionaryServiceImpl extends ServiceImpl<DictionaryDao,DictionaryEntity> implements DictionaryService {

}
