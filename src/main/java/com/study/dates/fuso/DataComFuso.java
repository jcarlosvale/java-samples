package com.study.dates.fuso;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataComFuso {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTimeSP = ZonedDateTime.of(dateTime, ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime zonedDateTimeAC = ZonedDateTime.of(dateTime, ZoneId.of("Brazil/Acre"));
        ZonedDateTime zonedDateTimePT = ZonedDateTime.of(dateTime, ZoneId.of("Europe/Lisbon"));

        System.out.println("Data hora fuso SP: " + zonedDateTimeSP);
        System.out.println("Data hora fuso AC: " + zonedDateTimeAC);
        System.out.println("Data hora fuso PT: " + zonedDateTimePT);
    }
}
