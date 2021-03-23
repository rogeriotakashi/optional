package com.rogerio.optionaldemo.examples;

import com.rogerio.optionaldemo.examples.xpto.CNH;
import com.rogerio.optionaldemo.examples.xpto.Funcionario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class BadPracticesExamples {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("rogerio","123456789", Optional.empty(), Optional.empty());
        System.out.println(funcionario);

        funcionario.setTelefone(Optional.of("99999-9999"));
        funcionario.setCnh(Optional.of(new CNH()));
        System.out.println(funcionario);
        print(funcionario.getNome(), funcionario.getCpf(), funcionario.getTelefone(), funcionario.getCnh());

        funcionario.setTelefone(null);
        funcionario.setCnh(null);
        System.out.println(funcionario);



        // Serializable example
//        try {
//            FileOutputStream fileOut = new FileOutputStream("/tmp/funcionario.xpto");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(funcionario);
//            out.close();
//            fileOut.close();
//            System.out.printf("Serialized data is saved in /tmp/employee.ser");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
    }

    public static String getStatus(){
        String status = "status";

        // Não utilizar o Optional como um if-case! (Overuse)
        String statusFinal = Optional.ofNullable(status).orElse("outro status");
        //String statusFinal = status != null ? status : "outro status";

        // ...
        // ...
        return statusFinal;
    }

    public static void print(String nome, String cpf, Optional<String> telefone, Optional<CNH> cnh){
        System.out.println("---------------------");
        System.out.println(nome);
        System.out.println(cpf);
        telefone.ifPresent(System.out::println);
        cnh.ifPresent(System.out::println);
        System.out.println("---------------------");
    }
}

