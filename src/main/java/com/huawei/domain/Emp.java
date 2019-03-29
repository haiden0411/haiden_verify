package com.huawei.domain;
/**
 * Author：胡灯
 * Date：2019-03-28 20:56
 * Description：<描述>
 */
public class Emp
{
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String address;
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
    public void setAddress(String address)
    {
        this.address = address;
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
