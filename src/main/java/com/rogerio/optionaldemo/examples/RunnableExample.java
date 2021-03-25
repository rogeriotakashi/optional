package com.rogerio.optionaldemo.examples;

public class RunnableExample {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Ola mundo!");

        // Supplier, Consumer, Predicate, Function
        // () -> T
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
