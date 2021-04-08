package com.rogerio.optionaldemo.examples;

import com.rogerio.optionaldemo.examples.xpto.CNH;
import com.rogerio.optionaldemo.examples.xpto.Funcionario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class BadPracticesExamples {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("rogerio","123456789", "", null);
        System.out.println(funcionario);

        funcionario.setTelefone("99999-9999");
        funcionario.setCnh(new CNH());
        System.out.println(funcionario);

        funcionario.setTelefone(null);
        funcionario.setCnh(null);
        System.out.println(funcionario.getTelefone());
        System.out.println(funcionario.getCnh());


        // Serializable example
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/funcionario.xpto");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(funcionario);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
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
}

