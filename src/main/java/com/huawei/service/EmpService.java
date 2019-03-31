package com.huawei.service;
import com.huawei.domain.Emp;

import java.util.List;
/**
 * Author：胡灯
 * Date：2019-03-31 23:29
 * Description：<描述>
 */
public interface EmpService
{
    public List<Emp> findByName(String name);
}
