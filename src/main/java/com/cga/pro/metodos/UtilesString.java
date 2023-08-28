package com.cga.pro.metodos;

public class UtilesString {

    public boolean esVocal(char c) {
        // if ("aeiou".contains(String.valueOf(c).toLowerCase())) {
        //    return true;
        // }
        // return false;

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
