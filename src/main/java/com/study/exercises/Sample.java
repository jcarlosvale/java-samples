package com.study.exercises;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {
//        var list = List.of("Toby", "Anna", "Leroy", "Alex");
//        list.stream()
//                .filter(n -> n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);
//
//        System.out.println("##############");
//
//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);

//        System.out.println("##############");
//
//        IntStream range = IntStream.range(1, 6);
//        range.forEach(System.out::println);

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
    }

}
