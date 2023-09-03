package com.cga.pro.investigacion.archivos_csv;

import java.util.List;

public class AppCsv {

    public static void main(String[] args) {

        ManageCsv file = new ManageCsv();

        List<String> rows = file.readFile("./src/main/java/com/cga/pro/investigacion/archivos_csv/bets.csv");

        for (String r : rows) {
            System.out.println(r);
        }
    }
}
