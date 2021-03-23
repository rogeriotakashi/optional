package com.rogerio.optionaldemo.examples;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Optional;


public class FlatMapOptionalExample {

    public static void main(String[] args) {
        User user = new User(new Endereco(new CEP(77060782L)));

        if(user != null){
            Endereco endereco = user.getEndereco();
            if (endereco != null) {
                CEP cep = endereco.getCep();
                if (cep != null) {
                    Long numeroCep = cep.getNumeroCep();
                    if (numeroCep != null) {
                        System.out.println("Numero do cep é:" + numeroCep);
                    }
                }
            }
        }
//        long numCep = 0;
//        if(user != null){
//            Endereco endereco = user.getEndereco();
//            if (endereco != null) {
//                CEP cep = endereco.getCep();
//                if (cep != null) {
//                    Long numeroCep = cep.getNumeroCep();
//                    if (numeroCep != null) {
//                        numCep = numeroCep;
//                    } else {
//                        numCep = 0L;
//                    }
//                } else {
//                    numCep = 0L;
//                }
//            } else {
//                numCep = 0L;
//            }
//        } else {
//            numCep = 0L;
//        }


    }
}

@Data
@RequiredArgsConstructor
class User{
    final Endereco endereco;

}

@Data
@RequiredArgsConstructor
class Endereco{
    final CEP cep;

}

@Data
@RequiredArgsConstructor
class CEP{
    final Long numeroCep;

}