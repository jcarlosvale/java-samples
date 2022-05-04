package com.study.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ManipulandoDatas {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime horario = LocalTime.now();
        LocalDateTime dataHora = LocalDateTime.of(data, horario);

        System.out.println("Data e hora corrente: " + dataHora);
    }
}
