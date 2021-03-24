package com.rogerio.optionaldemo.examples;

import lombok.Data;
import lombok.RequiredArgsConstructor;


public class FlatMapOptionalExample {

    public static void main(String[] args) {
        User user = new User(new DadosUser(new CEP(77060782L)));

        if(user != null){
            DadosUser dadosUser = user.getDadosUser();
            if (dadosUser != null) {
                CEP cep = dadosUser.getCep();
                if (cep != null) {
                    Long numeroCep = cep.getNumeroCep();
                    if (numeroCep != null) {
                        System.out.println("Numero do cep é:" + numeroCep);
                    }
                }
            }
        }
    }
}

@Data
@RequiredArgsConstructor
class User{
    final DadosUser dadosUser;

}

@Data
@RequiredArgsConstructor
class DadosUser {
    final CEP cep;

}

@Data
@RequiredArgsConstructor
class CEP{
    final Long numeroCep;

}