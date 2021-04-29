package com.rogerio.optionaldemo.examples;

public class GitExample {
    public static void main(String[] args) {
        System.out.println("Código da branch master");
        int x = 1;
        int y = 2;
        System.out.println(Calculadora.soma(x,y));
        System.out.println(Calculadora.sub(x,y));
        System.out.println(Calculadora.mult(x,y));
        System.out.println(Calculadora.div(x,y));
    }
}

class Calculadora {
    public static int soma(int x, int y){ return x + y; }
    public static int sub(int x, int y){ return x - y; }
    public static int mult(int x, int y){ return x * y; }
    public static int div(int x, int y){ return x / y; }
}


