package com.study.exercises;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStream {

    public static void main(String[] args) throws IOException {
        List<Actor> listaAtrizes = lerArquivo("src/oscarfemale.csv");

        List<Actor> listaAtores = lerArquivo("src/oscarmale.csv");

        System.out.println("Ator mais jovem: " + maisJovem(listaAtores));

        System.out.println("Atriz mais premiada: " + maisPremiado(listaAtrizes));

        System.out.println("Atriz entre 20 e 30 anos que mais vezes foi vencedora: " + maisPremiada20e30Anos(listaAtrizes, 20, 30));

        System.out.println("Atores e atrizes que receberam mais de um Oscar: " + atoresComMaisDeUmOscar(listaAtrizes, listaAtores));

        System.out.println("Resumo de Katharine Hepburn: ");

        printSummary("Katharine Hepburn", listaAtrizes, listaAtores);

    }

    private static void printSummary(String name, List<Actor> listaAtrizes, List<Actor> listaAtores) {
        List<Actor> actors = consolidate(listaAtrizes, listaAtores);
        List<Actor> filteredLines =
                actors.stream()
                .filter(actor -> actor.getName().equals(name))
                .collect(Collectors.toList());

        System.out.println("Ator/atriz: " + name);
        filteredLines.stream().forEach(actor -> System.out.println("\t\t" + actor.getYear() + " - " + actor.getAge() + " anos em " + actor.getMovie()));
        System.out.println("Total premios: " + filteredLines.size());
    }

    private static List<String> atoresComMaisDeUmOscar(List<Actor> listaAtrizes, List<Actor> listaAtores) {
        List<Actor> actors = consolidate(listaAtrizes, listaAtores);
        return
                actors.stream()
                        .collect(groupingBy(actor -> actor.getName(), counting()))
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() > 1)
                        .map(entry -> entry.getKey())
                        .collect(Collectors.toList());
    }

    private static List<Actor> consolidate(List<Actor> listaAtrizes, List<Actor> listaAtores) {
        List<Actor> actors = new ArrayList<>(listaAtrizes);
        actors.addAll(listaAtores);
        return actors;
    }

    private static String maisPremiada20e30Anos(List<Actor> listaAtores, int minAge, int maxAge) {
        List<Actor> filtered =
                listaAtores.stream()
                .filter(actor -> actor.getAge() >= minAge && actor.getAge() <= maxAge)
                .collect(Collectors.toList());
        return maisPremiado(filtered);
    }

    private static String maisPremiado(List<Actor> listaAtores) {
        return
                listaAtores.stream()
                        .collect(groupingBy(actor -> actor.getName(), counting()))
                        .entrySet()
                        .stream().max((o1, o2) -> (int) (o1.getValue() - o2.getValue()))
                        .get()
                        .getKey();
    }

    private static Actor maisJovem(List<Actor> listaAtores) {
        return listaAtores.stream().min(Comparator.comparingInt(Actor::getAge)).orElse(null);
    }

    private static List<Actor> lerArquivo(String arquivo) throws IOException {
        return Files.lines(Paths.get(arquivo))
        .skip(1)
        .map(line -> line.split(";"))
        .map(col -> new Actor(Integer.parseInt(col[0].trim()), Integer.parseInt(col[1].trim()), Integer.parseInt(col[2].trim()), col[3].trim(), col[4].trim()))
        .collect(Collectors.toList());
    }
}
