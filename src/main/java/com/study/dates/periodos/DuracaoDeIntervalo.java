package com.study.dates.periodos;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DuracaoDeIntervalo {

    public static void main(String[] args) {
        LocalTime begins = LocalTime.of(12, 07, 10);
        LocalTime ends = LocalTime.of(14, 22, 37);
        System.out.println("Intervalo: " + begins + " - " + ends);

        long minutes = ChronoUnit.MINUTES.between(begins, ends);
        System.out.println("Total minutos: " + begins + " - " + ends);

        Duration duration = Duration.ofMinutes(minutes);
        System.out.println("Duracao do intervalo: " + duration);
    }
}
