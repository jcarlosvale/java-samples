package com.study.dates.geral;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloJava {
    public static void main(String [] args) {
        Stream<String> stream = Stream.of("b", "o", "l", "a");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set); // [f, w, l, o]
    }
}
