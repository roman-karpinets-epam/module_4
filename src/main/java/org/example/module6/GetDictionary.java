package org.example.module6;

import java.util.HashMap;
import java.util.Map;

public class GetDictionary {

    public static Map<Character, Integer> getDictionary (String input) {

        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
