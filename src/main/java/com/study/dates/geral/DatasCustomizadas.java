package com.study.dates.geral;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasCustomizadas {

    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2022, 01, 01);
        LocalDate dataFim = LocalDate.parse("2022-01-30");
        System.out.println("Ferias de " + dataInicio + " ate " + dataFim);

        LocalTime horaInicio = LocalTime.of(8,15,30);
        LocalTime horaFim = LocalTime.parse("09:47:55");
        System.out.println("Intervalo de " + horaInicio + " ate " + horaFim);

        LocalDateTime dataHoraInicio = LocalDateTime.of(2022, 12,15, 1, 22, 43);
        LocalDateTime dataHoraFim = LocalDateTime.parse("2022-12-20T05:45:43");
        System.out.println("Recesso de " + dataHoraInicio + " ate " + dataHoraFim);

    }
}
