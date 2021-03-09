package com.threads.murilo.banheiroocupado;

public class Banheiro {

    private boolean limpo= true;

    public void usar(String usuario) throws InterruptedException {
        System.out.println(usuario +" esta batendo no banheiro");



        synchronized (this){
            System.out.println(usuario +" esta entrando no banheiro");

            if(!limpo) {
                System.out.println(usuario +"Chamando a limpeza");
                this.wait();

            }

            System.out.println(usuario +" esta usando o banheiro");
            if(Math.random()*10>5)
                limpo = false;
            Thread.sleep(7000);

            System.out.println(usuario +" esta saindo do banheiro");
        }


    }



    public void limpar(){

        synchronized (this){



        }
    }


}
