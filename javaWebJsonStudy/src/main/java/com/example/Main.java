package com.example;


import com.fasterxml.jackson.core.JsonProcessingException;

//这个导入的是jackson包里面的一个类，用来把java对象转成json字符串
import com.fasterxml.jackson.databind.ObjectMapper;

//这两个导入的是pojo包里面的两个java类
import pojo.Dog;
import pojo.person;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Dog dog = new Dog("大黄");
        person p = new person("小明", 18, new String[]{"打游戏","看电影"}, dog);
        ObjectMapper mapper = new ObjectMapper();
        String dogStr = mapper.writeValueAsString(dog);
        String personStr = mapper.writeValueAsString(p);

        System.out.println(personStr);

        String wantedDeal = "{\"name\":\"小明\",\"age\":18,\"hobby\":[\"打游戏\",\"看电影\"],\"dog\":{\"name\":\"大黄\"}}";
        person p2 = mapper.readValue(wantedDeal, person.class);
        System.out.println(p2.getName());


    }
}