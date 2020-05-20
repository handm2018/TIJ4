package chapter13_collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("百度", "李彦宏");
        map.put("阿里", "马云");
        map.put("字节跳动", "张一鸣");

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            String value = map.get(s);
            System.out.println("key:" + s + ",value:" + value);
        }
    }
}
