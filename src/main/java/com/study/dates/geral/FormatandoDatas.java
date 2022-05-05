package com.study.dates.geral;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDatas {

    public static void main(String[] args) {
        String strDataFormatoBR = "25-06-1980 11:15";
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dataHoraBR = LocalDateTime.parse(strDataFormatoBR, formatoData);
        System.out.println("Data e hora extraidos do formato BR: " + dataHoraBR);

        DateTimeFormatter outroFormato = DateTimeFormatter.ofPattern("dd MM yy - HH, mm");
        System.out.println("Outros formatos: " + dataHoraBR.format(outroFormato));
    }

}
