package com.huawei.controller;
import com.huawei.domain.ThObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
/**
 * Author：胡灯
 * Date：2019-04-02 22:14
 * Description：<描述>
 */
@Controller
public class ThymeleafController
{
    @RequestMapping("thymeleaf")
    public String thymeleaf(ModelMap map){
        map.put("thText", "th:text 设置文本内容 <b>加粗</b>");
        map.put("thUText", "th:utext 设置文本内容 <b>加粗</b>");
        map.put("thValue", "thValue 设置当前元素的value值");
        map.put("thEach", Arrays.asList("th:each", "遍历列表"));
        map.put("thIf", "msg is not null");
        map.put("thObject", new ThObject(1L, "th:object", "用来偷懒的th属性"));
        return "thymeleaf";

    }
}
