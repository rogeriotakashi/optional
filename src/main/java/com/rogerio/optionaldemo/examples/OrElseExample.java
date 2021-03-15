package com.rogerio.optionaldemo.examples;


import java.util.Optional;

public class OrElseExample {

    public static void main(String[] args) {

        Optional<String> texto = Optional.of("Conteudo");
        String resultado = texto.orElse(getTextoDefault());

        Optional<String> texto2 = Optional.empty();
        String resultado2 = texto2.orElse(getTextoDefault());

        System.out.println(resultado);
        System.out.println(resultado2);
    }

    public static String getTextoDefault(){
        System.out.println("!!! Recuperando o texto Default !!!");

        return "Texto estava vazio! Retornando valor pelo orElse";
    }

}
