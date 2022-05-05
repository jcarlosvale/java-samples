package com.study.functional.programming;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {

        // lista de animais
        List<Animal> animais = new ArrayList<Animal>();
        animais.add(new Animal("peixe", false, true));
        animais.add(new Animal("canguru", true, false));
        animais.add(new Animal("coelho", true, false));
        animais.add(new Animal("tartaruga", false, true));

        // imprime os animais que podem saltar
        imprimir(animais, animal -> animal.podeSaltar());
    }
    private static void imprimir(List<Animal> animais, Verificador verificador) {
        for (Animal animal : animais) {

            // verificando
            if (verificador.verificar(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}