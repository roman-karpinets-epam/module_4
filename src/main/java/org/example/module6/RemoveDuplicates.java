package org.example.module6;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static <T> Collection<T> removeDuplicatesFromCollection(Collection<T> collection){

        return new TreeSet<T>(collection);
    }

}
