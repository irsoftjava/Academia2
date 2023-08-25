package com.cga.pro.metodos;

public class UtilesMath {

    // esPrimo: Devuelve true si es primo, de lo contrario false
    // parámetros: Valor entero
    public boolean esPrimo(int n) {

        if (n == 0 || n == 1) return false;

        for (int p = 2; p < n; p++) {
            if (n % p == 0) return false;
        }

        return true;
    }

    // divisoresPrimos: Devuelve la cantidad de divisores de un número
    // parámetros: Valor entero.
    public int divisoresPrimos(int n) {
        int resp = 0;

        for (int d = 1; d <= n; d++) {
            if (n % d == 0 && esPrimo(d))
                resp++;
        }
        return resp;
    }

    // calculadora: Aplica el operador op a los operandos a y b
    // parámetros: Operador op, operandos a y b
    public double calculadora(char op, double a, double b) {
        double resultado = 0.0;

        switch (op) {
            case '+': resultado = a + b; break;
            case '-': resultado = a - b; break;
            case '*': resultado = a * b; break;
            case '/': {
                if (b == 0)
                    System.out.println("Lo sentimos, Divisor debe ser mayor que cero...");
                else
                    resultado = a / b;
                break;
            }
        }

        return resultado;
    }

    // maximoValor: Devuelve el máximo valor de dos números de tipo enteros
    //              En caso de ser iguales, retorna 0.
    // parámetros: Valores enteros a y b
    public int maximoValor(int a, int b) {
        if (a > b)
            return a;
        else if (a < b)
            return b;
        else return 0;
    }

    // maximoValor: Devuelve el máximo valor de tres números de tipo enteros
    //              En caso de ser iguales, retorna 0.
    // parámetros: Valores enteros a, b y c
    public int maximoValor(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else if (c > a && c > b)
            return c;
        else return 0;
    }

    // aLaN: Funcion recursiva que devuelve el valor de 'a' elevado a la potencia de 'exp'
    // parámetros: Valores 'base' de tipo Double y 'exp' de tipo Integer.
    public double aLaN(double base, int exp) {
        double resp = 0;

        if (exp == 0)
            return 1.0;
        else {
            resp = base * aLaN(base, exp - 1);
        }

        return resp;
    }

    // Maximo Común Divisor
    public int mcd(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        //return mcd(b, a % b);
        return (a >= b) ? mcd(a - b, b) : mcd(a, b - a);
    }

    /*
    * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657,
    * 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352,
    * 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903,
    * 2971215073, 4807526976, 7778742049, 12586269025, ...
    * */
    public int enesimoTerminoFibonacci(int n) {
        int respuesta;

        if (n == 0 || n == 1)
            return n;
        else
            respuesta = enesimoTerminoFibonacci(n - 1) + enesimoTerminoFibonacci(n - 2);

        return respuesta;
    }
}
