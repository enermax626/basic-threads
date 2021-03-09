package com.threads.murilo;

public class SimpleThreadString {
    public static void main(String[] args) {


        System.out.println("Inicio do main");

        System.out.println("Imprimindo antes da thread");

        new Thread(() -> {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Impriminddo dentro da thread;");

        }).start();

        System.out.println("Imprimindo após sair da thread");


    }



}
