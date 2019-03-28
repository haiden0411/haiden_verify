package com.huawei.controller;
import com.huawei.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
/**
 * Author：胡灯
 * Date：2019-03-27 23:31
 * Description：<描述>
 */
@Controller
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/toAdd")
    public String toAdd(User user){
        return "add";
    }

    @RequestMapping("/add")
    public String add(@Valid User user, BindingResult br){
        if (br.hasErrors())
        {
            return "add";
        }
        System.out.println("保存用户 " + user);
        return "succ";
    }
}
