package com.huawei.service.impl;
import com.huawei.dao.EmpRepository;
import com.huawei.domain.Emp;
import com.huawei.service.EmpService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
/**
 * Author：胡灯
 * Date：2019-03-31 23:30
 * Description：<描述>
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService
{
    @Resource
    private EmpRepository empRepository;
    @Override
    @Cacheable(value = "emp")
    public List<Emp> findByName(String name)
    {
        return empRepository.findByName(name);
    }
}
