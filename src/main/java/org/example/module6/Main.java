package org.example.module6;

import java.util.*;

import org.example.module6.GetDictionary;

import static org.example.module6.CollectionsToMap.collectionsToMapA;
import static org.example.module6.CollectionsToMap.collectionsToMapB;
import static org.example.module6.GetDictionary.getDictionary;
import static org.example.module6.RemoveDuplicates.removeDuplicatesFromCollection;


public class Main {

    public static void main(String[] args) {

        //First task
        Map<Character, Integer> map = getDictionary("test");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Second task
        Collection <Integer> withDuplicates = new ArrayList(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 1, 2, 1));
        System.out.println("List with duplicates: " + withDuplicates);
        Collection <Integer> withoutDuplicates = removeDuplicatesFromCollection(withDuplicates);
        System.out.println("List without duplicates: " + withoutDuplicates);

        //Third task
        String[] orders = {"Car", "Shirt", "Pen", "Laptop", "Pants", "Shirt", "Pants", "Shirt"};
        System.out.println("Original array: " + Arrays.toString(orders));
        Set <String> tree =  new TreeSet (Arrays.asList(orders));
        System.out.println("TreeSet: " + tree); //alphabetical order
        Set <String> hash = new HashSet (Arrays.asList(orders));
        System.out.println("HashSet: " + hash); //no order

        //Bonus task
        List <Integer> keys = new ArrayList(Arrays.asList(2, 4, 6, 8, 10));
        List <String> values = new  ArrayList(Arrays.asList("Two", "Four", "Six", "Eight"));
        Map<Integer, String> combinedA = collectionsToMapA(keys, values);
        System.out.println(combinedA);
        Map<Integer, String> combinedB = collectionsToMapB(keys, values);
        System.out.println(combinedB);
    }
}
