package org.example.module6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionsToMap {

    public static Map collectionsToMap (ArrayList <Integer> a, ArrayList <String> b){

        int sizeA = a.size();
        int sizeB = b.size();

        if (sizeA>sizeB){
            throw new RuntimeException("Value is not enough for the Map");
        } else if (sizeA<sizeB) {
            throw new RuntimeException("Key is not enough for the Map");
        }
        else {
            Map result = new HashMap();
            for (int i = 0; i<sizeA; i++){
                result.put(a.get(i), b.get(i));
            }
            return result;
        }
    }
}
