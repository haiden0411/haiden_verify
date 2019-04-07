package com.huawei.java8.lamda;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 * Author：胡灯
 * Date：2019-04-07 20:05
 * Description：<描述>
 */
public class SteamTest
{
    static void gen1(){
        String [] arr ={"a","b","c","d"};
        Stream<String> arr1 = Stream.of(arr);
    }
    public static void main(String[] args) throws IOException
    {
//        String str = "aafaf45454564623242342sddfaf";
////        IntStream chars = str.chars();
////        chars.forEach(System.out::println);
////        Files.lines(Paths.get("d:/test/test.txt")).forEach(System.out::println);
////        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
////        iterate.limit(10).forEach(System.out::println);
////        int sum = Arrays.asList(1, 2, 3, 4, 5).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
////        System.out.println(sum);

        String test = "11,22,33,44,55";
        int sum = Stream.of(test.split(",")).mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
        Person haiden = new Person("haiden");
        List<Person> lists = new ArrayList<>();
        lists.add(haiden);
        Map<String, Person> collect = lists.stream().collect(Collectors.toMap(Person::getName, person -> person));
        System.out.println(collect);
    }
}

class Person{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
