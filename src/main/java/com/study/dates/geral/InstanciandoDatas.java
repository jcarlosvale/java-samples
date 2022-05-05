package com.study.dates.geral;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class InstanciandoDatas {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime horario = LocalTime.now();

        LocalDateTime dataHora = LocalDateTime.of(data, horario);
        System.out.println("Data e hora usando LocalDateTime.of(data, horario): " + dataHora);

        dataHora = LocalDateTime.now();
        System.out.println("Data e hora usando LocalDateTime.now(): " + dataHora);
    }
}
