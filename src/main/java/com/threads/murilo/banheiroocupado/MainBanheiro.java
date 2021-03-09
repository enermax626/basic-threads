package com.threads.murilo.banheiroocupado;

public class MainBanheiro {


    public static void main(String[] args) {


        Banheiro banheiro = new Banheiro();

        new Thread(new UsarBanheiro("Marcelo",banheiro)).start();
        new Thread(new UsarBanheiro("Diego",banheiro)).start();
        new Thread(new UsarBanheiro("Carlos",banheiro)).start();


    }



}
