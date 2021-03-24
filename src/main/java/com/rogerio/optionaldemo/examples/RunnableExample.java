package com.rogerio.optionaldemo.examples;

public class RunnableExample {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Ola mundo!");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
