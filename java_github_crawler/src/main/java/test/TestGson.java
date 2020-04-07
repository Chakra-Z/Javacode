package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

public class TestGson {
    static class Test{
        private int key1;
        private int key2;
    }

    public static void main(String[] args) {
        // 1. 先创建一个Gson对象
        Gson gson = new GsonBuilder().create();
        // 2. 把键值对转成JSON格式
        HashMap<String, String> hashMap = new HashMap<>();
        String result = gson.toJson(hashMap);   //把键值对转成JSON格式
        System.out.println(result);

        // 3. 把JSON格式转成键值对
        String jsonString = "{\"key1\":111,\"key2\":222}";
        // Test.class取出类对象
        // fromJson 实现依赖反射机制
        // fromJson 实现过程，通过Test.class知道key1(int)
        Test test = gson.fromJson(jsonString, Test.class);
        System.out.println(test.key1);
        System.out.println(test.key2);
    }
}
