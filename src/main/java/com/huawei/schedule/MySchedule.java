package com.huawei.schedule;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
/**
 * Author：胡灯
 * Date：2019-04-01 0:26
 * Description：<描述>
 */
//@Component
public class MySchedule
{
    @Scheduled(cron = "0/3 * * * * ?")
    public void test(){
        System.out.println("执行任务:"+new Date());
    }
}
