package com.study.dates.fuso;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class HorarioDeVerao {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse("2018-05-01T05:00:00");
        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zonedDateTimeSP = ZonedDateTime.of(dateTime, zoneId);

        boolean isDaylightSaving = zoneId.getRules().isDaylightSavings(zonedDateTimeSP.toInstant());
        System.out.println("Em " + zonedDateTimeSP + " SP esta em horario de verao: " + isDaylightSaving);

        dateTime = LocalDateTime.parse("2018-12-01T05:00:00");
        zonedDateTimeSP = ZonedDateTime.of(dateTime, zoneId);
        isDaylightSaving = zoneId.getRules().isDaylightSavings(zonedDateTimeSP.toInstant());
        System.out.println("Em " + zonedDateTimeSP + " SP esta em horario de verao: " + isDaylightSaving);
    }

}
