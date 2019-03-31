package com.huawei.test;
import com.huawei.HaidenApplication;
import com.huawei.dao.EmpJpaRepository;
import com.huawei.dao.EmpRepository;
import com.huawei.domain.Dept;
import com.huawei.domain.Emp;
import com.huawei.service.EmpService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Author：胡灯
 * Date：2019-03-28 20:59
 * Description：<描述>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HaidenApplication.class)
public class EmpTest
{
    @Resource
    private EmpJpaRepository empJpaRepository;

    @Resource
    private EmpRepository empRepository;

    @Resource
    private EmpService empService;
    //@Test
    public void testRepositorySave()
    {
        for (int i = 0; i <10 ; i++)
        {
            Emp emp = new Emp("haiden"+i, 15+i, "男", "黄山门"+i);
            empJpaRepository.save(emp);
        }


    }

    @Test
    public void testRepository(){
        List<Emp> emps = empRepository.findByName("haiden");
        emps.stream().forEach(System.out::println);
        List<Emp> emps1 = empRepository.queryName("gree");
        emps1.stream().forEach(System.out::println);
        List<Emp> emps2 = empRepository.findByNameLike("%haiden%");
        emps2.stream().forEach(System.out::println);
    }
    
    //@Test
    @Transactional
    public void testManyToOne(){
        Emp emp1 = new Emp("nexus", 35, "女", "南京");
        Emp emp2 = new Emp("mingming",26,"男","西安");
        Dept dept = new Dept("销售部");
        Set<Emp> emps = new HashSet<Emp>();
        emps.add(emp1);
        emps.add(emp2);
        dept.setEmps(emps);
        emp1.setDept(dept);
        emp2.setDept(dept);
        empJpaRepository.save(emp1);
        empJpaRepository.save(emp2);
    }

    @Test
    public void testCache(){
        List<Emp> emps = empService.findByName("nexus");
        emps.stream().forEach(System.out::println);
        List<Emp> emps1 = empService.findByName("nexus");
        emps1.stream().forEach(System.out::println);
        List<Emp> emps2 = empService.findByName("nexus");
        emps2.stream().forEach(System.out::println);
        List<Emp> emps3 = empService.findByName("nexus");
        emps3.stream().forEach(System.out::println);

    }


}
