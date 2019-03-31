package com.huawei.domain;
import javax.persistence.*;
import java.io.Serializable;
/**
 * Author：胡灯
 * Date：2019-03-28 20:56
 * Description：<描述>
 */
@Entity
@Table(name = "t_emp")
public class Emp implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dept_id")
    private Dept dept;
    public Emp()
    {
    }
    public Emp(String name, Integer age, String gender, String address)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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
    public Integer getAge()
    {
        return age;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getAddress()
    {
        return address;
    }
    public Dept getDept()
    {
        return dept;
    }
    public void setDept(Dept dept)
    {
        this.dept = dept;
    }
    @Override
    public String toString()
    {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
