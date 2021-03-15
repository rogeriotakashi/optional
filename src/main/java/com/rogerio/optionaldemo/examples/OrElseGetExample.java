package com.rogerio.optionaldemo.examples;


import java.util.Optional;

public class OrElseGetExample {

    public static void main(String[] args) {

        Optional<String> texto = Optional.of("Conteudo");
        String resultado = texto.orElseGet(OrElseGetExample::getTextoDefault);

        Optional<String> texto2 = Optional.empty();
        String resultado2 = texto2.orElseGet(OrElseGetExample::getTextoDefault);

        System.out.println(resultado);
        System.out.println(resultado2);
    }

    public static String getTextoDefault(){
        System.out.println("!!! Recuperando o texto Default !!!");

        return "Texto estava vazio! Retornando valor pelo orElse";
    }

}
