package com.huawei.domain;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * Author：胡灯
 * Date：2019-03-31 21:24
 * Description：<描述>
 */
@Entity
@Table(name = "t_dept")
public class Dept implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "dept")
    private Set<Emp> emps = new HashSet<Emp>();

    public Set<Emp> getEmps()
    {
        return emps;
    }
    public void setEmps(Set<Emp> emps)
    {
        this.emps = emps;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Dept()
    {
    }
    public Dept(String name)
    {
        this.name = name;
    }
}
