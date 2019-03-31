package com.huawei.dao;
import com.huawei.domain.Emp;
import org.hibernate.annotations.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;
/**
 * Author：胡灯
 * Date：2019-03-31 21:28
 * Description：<描述>
 */
public interface EmpRepository extends Repository<Emp,Integer>
{
    public List<Emp> findByName(String name);
    @Query(value = "select * from t_emp where name = ?",nativeQuery = true)
    public List<Emp> queryName(String name);
    public List<Emp> findByNameLike(String name);
}
