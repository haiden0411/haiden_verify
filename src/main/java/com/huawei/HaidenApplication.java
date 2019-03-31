package com.huawei;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@SpringBootApplication
@EnableCaching
public class HaidenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HaidenApplication.class, args);
    }
}
