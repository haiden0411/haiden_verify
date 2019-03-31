package com.huawei.dao;
import com.huawei.domain.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Author：胡灯
 * Date：2019-03-31 21:36
 * Description：<描述>
 */
public interface EmpJpaRepository extends JpaRepository<Emp,Integer>
{

}
