package org.example.module6;

import java.util.*;

import org.example.module6.GetDictionary;

import static org.example.module6.CollectionsToMap.collectionsToMap;
import static org.example.module6.GetDictionary.getDictionary;
import static org.example.module6.RemoveDuplicates.removeDuplicatesFromCollection;


public class Main {

    public static void main(String[] args) {

        //First task
        getDictionary("test");

        //Second task
        Collection withDuplicates = new ArrayList();
        Collection withoutDuplicates = new ArrayList();
        withDuplicates.add(1);
        withDuplicates.add(2);
        withDuplicates.add(3);
        withDuplicates.add(4);
        withDuplicates.add(1);
        withDuplicates.add(2);
        withDuplicates.add(3);
        withDuplicates.add(1);
        withDuplicates.add(2);
        withDuplicates.add(1);
        System.out.println("List with duplicates: " + withDuplicates);
        withoutDuplicates = removeDuplicatesFromCollection(withDuplicates);
        System.out.println("List without duplicates: " + withoutDuplicates);

        //Third task
        String[] orders = {"Car", "Shirt", "Pen", "Laptop", "Pants", "Shirt", "Pants", "Shirt"};
        System.out.println("Original array: " + Arrays.toString(orders));
        Set tree =  new TreeSet (Arrays.asList(orders));
        System.out.println("TreeSet: " + tree); //alphabetical order
        Set hash = new HashSet (Arrays.asList(orders));
        System.out.println("HashSet: " + hash); //no order

        //Bonus task
        ArrayList <Integer> keys = new ArrayList();
        keys.add(2);
        keys.add(4);
        keys.add(6);
        keys.add(8);
        ArrayList <String> values = new  ArrayList();
        values.add("Two");
        values.add("Four");
        values.add("Six");
        values.add("Eight");
        Map map = new HashMap<Integer, String>();
        map = collectionsToMap(keys, values);
        System.out.println(map);
    }
}
