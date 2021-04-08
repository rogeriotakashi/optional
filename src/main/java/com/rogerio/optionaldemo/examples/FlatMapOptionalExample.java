package com.rogerio.optionaldemo.examples;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Optional;


public class FlatMapOptionalExample {

    public static void main(String[] args) {
        User user = new User(null);

//        if(user != null){
//            DadosUser dadosUser = user.getDadosUser();
//            if (dadosUser != null) {
//                CEP cep = dadosUser.getCep();
//                if (cep != null) {
//                    Long numeroCep = cep.getNumeroCep();
//                    if (numeroCep != null) {
//                        System.out.println("Numero do cep é:" + numeroCep);
//                    }
//                }
//            }
//        }
//        Optional<Optional<CEP>> cep = Optional.ofNullable(user)
//                .map(user1 -> user1.getDadosUser())
//                .map(dadosUser1 -> dadosUser1.get().getCep());

        Long numeroCep = Optional.ofNullable(user)
                                            .flatMap(User::getDadosUser)
                                            .flatMap(DadosUser::getCep)
                                            .flatMap(CEP::getNumeroCep)
                                            .orElse(10L);
        // (T) -> U
        System.out.println(numeroCep);
    }
}

@Data
@RequiredArgsConstructor
class User{
    final DadosUser dadosUser;

    public Optional<DadosUser> getDadosUser() {
        return Optional.ofNullable(dadosUser);
    }
}

@Data
@RequiredArgsConstructor
class DadosUser {
    final CEP cep;

    public Optional<CEP> getCep() {
        return Optional.ofNullable(cep);
    }
}

@Data
@RequiredArgsConstructor
class CEP{
    final Long numeroCep;

    public Optional<Long> getNumeroCep() {
        return Optional.ofNullable(numeroCep);
    }
}