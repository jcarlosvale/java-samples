package com.study.functional.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UsoDoPredicate {

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("peixe", false, true));
        animais.add(new Animal("canguru", true, false));

        print(animais, a -> a.podeSaltar());
    }
    private static void print(List<Animal> animais, Predicate<Animal> verificador) {
        for (Animal animal : animais) {
            if (verificador.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
