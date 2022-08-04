package org.example.module6;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static Collection removeDuplicatesFromCollection(Collection<Integer> collection){

        Set<Integer> withoutDuplicates = new TreeSet<Integer>(collection);

        return withoutDuplicates;
    }

}
