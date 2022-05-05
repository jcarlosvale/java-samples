package com.study.functional.programming;

import java.util.ArrayList;
import java.util.List;

public class ExemploUsandoLambdasEmAPI {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Joao");
        names.add("Jose");
        names.add("Maria");
        System.out.println("Nomes: " + names);

        names.removeIf(name -> !name.startsWith("J"));
        System.out.println("Nomes iniciando com J: " + names);

        names.add("Araci");
        names.add("Ze");
        System.out.println("\nNomes: " + names);

        names.sort((name1, name2) -> name1.compareTo(name2));
        System.out.println("Nomes ordenados: " + names);

        System.out.println("\nImprimindo novamente");
        names.forEach(name -> System.out.println(name));

    }
}
