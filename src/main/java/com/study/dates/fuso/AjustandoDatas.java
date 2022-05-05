package com.study.dates.fuso;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

public class AjustandoDatas {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse("2018-05-01T05:00:00");
        ZonedDateTime zonedDateTimeSP = ZonedDateTime.of(dateTime, ZoneId.of("America/Sao_Paulo"));
        System.out.println("O dia " + zonedDateTimeSP + " foi no dia da semana: " + zonedDateTimeSP.getDayOfWeek());

        ZonedDateTime nextFridayDateTime = zonedDateTimeSP.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("A data da proxima SEXTA foi: " + nextFridayDateTime);
    }
}
