package com.huawei.domain;
/**
 * Author：胡灯
 * Date：2019-04-02 22:16
 * Description：<描述>
 */
public class ThObject
{

    private Long id;

    private String name;

    private String desc;

    public ThObject()
    {
    }
    public ThObject(Long id, String name, String desc)
    {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }
    public long getId()
    {
        return id;
    }
    public void setId(Long id)
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
    public String getDesc()
    {
        return desc;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
}
