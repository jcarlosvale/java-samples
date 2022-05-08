package com.study.functional.programming;

import java.util.Arrays;
import java.util.Comparator;

public class UsoDoComparator {

    public static void main(String[] args) {
        Integer [] array = {4, 1, 7, 2, 5};
        print(array, (i1, i2) -> i1 - i2);
    }

    public static void print(Integer [] array, Comparator<Integer> comparator) {
        Arrays.sort(array, comparator);
        System.out.println(Arrays.toString(array));
    }
}
