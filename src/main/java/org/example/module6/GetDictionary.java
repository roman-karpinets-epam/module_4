package org.example.module6;

import java.util.HashMap;
import java.util.Map;

public class GetDictionary {

    public static Map getDictionary (String input) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }

        return map;
    }

}
