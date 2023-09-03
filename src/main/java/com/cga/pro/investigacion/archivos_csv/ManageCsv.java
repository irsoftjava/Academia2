package com.cga.pro.investigacion.archivos_csv;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ManageCsv {

    private BufferedReader br;
    private String row;
    private final List<String> pars = new ArrayList<>();

    public List<String> readFile(String name) {
        try {
            br = new BufferedReader(new FileReader( name ));
            while ( ( row = br.readLine() ) != null) {
                //pars = row.split(",");
                pars.add(row);
            }
            br.close();
            row = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pars;
    }
}
