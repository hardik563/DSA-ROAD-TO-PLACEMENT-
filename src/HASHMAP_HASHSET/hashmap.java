package HASHMAP_HASHSET;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();

        map.put("hardik",99);
        map.put("orange",1);
        map.put("apple",2);
        System.out.println(map);
        map.put("hardik",100);
        System.out.println(map);
        System.out.println(map.get("hardik"));
    }
}
