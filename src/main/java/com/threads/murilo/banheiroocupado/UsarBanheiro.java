package com.threads.murilo.banheiroocupado;

public class UsarBanheiro implements Runnable {


    private final String usuario;
    private Banheiro banheiro;

    public UsarBanheiro(String marcelo, Banheiro banheiro) {
        this.usuario = marcelo;
        this.banheiro = banheiro;
    }

    @Override
    public void run() {

        try {
            banheiro.usar(usuario);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
