package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        Set<Integer> set = Arrays.stream(a).boxed().collect(Collectors.toSet());
        Integer[] uniqueArray = set.toArray(new Integer[0]);
        for( Integer i : uniqueArray) {
            int search = i;
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == search) {
                    count++;
                }
            }
            if(count % 2 == 1){
                return search;
            }
        }
        return -1;
    }
}