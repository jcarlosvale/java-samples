package com.study.dates.periodos;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class UsandoInstant {

    public static void main(String[] args) {
        ZonedDateTime eventDateTime = ZonedDateTime.of(1998, 1, 13, 16, 45, 56, 0, ZoneId.of("America/Sao_Paulo"));
        Instant eventInstant = eventDateTime.toInstant();
        System.out.println("Data e hora do evento: " + eventDateTime);
        System.out.println("Instante do evento: " + eventInstant);

        System.out.println("\nNumero de segundos de 01-Janeiro-1970 ate o inicio do evento: " + eventInstant.getEpochSecond());

    }
}
