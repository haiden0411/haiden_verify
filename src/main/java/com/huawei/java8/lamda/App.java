package com.huawei.java8.lamda;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
/**
 * Author：胡灯
 * Date：2019-04-05 20:58
 * Description：<描述>
 */
public class App
{
    public static void main(String[] args)
    {
        Runnable runnable = () -> {
            System.out.println("aa");
        };
        Foo foo =user -> 1;
        System.out.println(foo.insert(new User()));
        Function<String,String> fn = String::toUpperCase;
        System.out.println(fn.apply("admin"));
        Consumer<User> con = (User user)->new User().ret();
        BiConsumer<User,String> bicon = User::hello;


    }
}

interface Foo {
    int insert(User user);
}

class User{
    public void hello(String str){
        System.out.println(str);
    }

    public String ret(){
        return "hello";
    }

    public void foo(){

    }
}
