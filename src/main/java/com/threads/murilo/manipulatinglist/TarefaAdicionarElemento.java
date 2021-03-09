package com.threads.murilo.manipulatinglist;

public class TarefaAdicionarElemento implements Runnable {


    private Lista lista;
    private int numThread;

    public TarefaAdicionarElemento(Lista lista, int numt) {
        this.lista = lista;
        numThread = numt;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            lista.adicionaElementos("ThreadNum: "+numThread+" valor: "+i);
        }


    }
}
