package com.threads.murilo.manipulatinglist;

public class PrincipalLista {


    public static void main(String[] args) throws InterruptedException {
        Lista lista = new Lista();

        for(int i =0; i<100; i++){


            new Thread(new TarefaAdicionarElemento(lista,i)).start();

        }
        Thread.sleep(2000);

        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(lista.pegaElemento(i));
        }


    }



}
