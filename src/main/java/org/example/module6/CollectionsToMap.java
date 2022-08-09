package org.example.module6;

import java.util.*;

public class CollectionsToMap {

    public static Map<Integer, String> collectionsToMapA (List<Integer> a, List <String> b){

        int sizeA = a.size();
        int sizeB = b.size();
        Map <Integer, String>result = new HashMap();

        if (sizeA>sizeB){
            for (int i = 0; i<sizeB; i++){
                result.put(a.get(i), b.get(i));
            }
            for (int i = sizeB; i<sizeA; i++){ //adding null values to the additional keys
                result.put(a.get(i), null);
            }
        }
        else {
            for (int i = 0; i<sizeA; i++){
                result.put(a.get(i), b.get(i));
            }
        }
        return result;
    }

    public static Map<Integer, String> collectionsToMapB (List<Integer> a, List <String> b){

        int sizeA = a.size();
        int sizeB = b.size();

        if (sizeA>sizeB){
            throw new IllegalArgumentException("Value is not enough for the Map");
        } else if (sizeA<sizeB) {
            throw new IllegalArgumentException("Key is not enough for the Map");
        }
        else {
            Map<Integer, String> result = new HashMap();
            for (int i = 0; i<sizeA; i++){
                result.put(a.get(i), b.get(i));
            }
            return result;
        }
    }
}
