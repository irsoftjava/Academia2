package com.cga.pro.investigacion.loteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loteria {

    public Loteria() {
    }

    public List<Integer> generaBonoloto() {
        ArrayList<Integer> resp = new ArrayList<>();

        int vcc = 0;
        while (vcc != 7) {
            int v = (int) (Math.random() * 49 + 1);
            if (resp.contains(v)) continue;
            else resp.add(v);
            vcc++;
        }
        Collections.sort(resp);
        return resp;
    }

    public List<Integer> generaPrimitiva() {
        ArrayList<Integer> resp = new ArrayList<>();

        int vcc = 0;
        while (vcc != 7) {
            int v = (int) (Math.random() * 49 + 1);
            if (resp.contains(v)) continue;
            else resp.add(v);
            vcc++;
        }
        Collections.sort(resp);
        return resp;
    }

    public Integer compareTo(List<Integer> a, List<Integer> b) {
        Integer resp = 0;

        for (Integer i : a) {
            if (b.contains(i)) resp++;
        }

        return resp;
    }

}
