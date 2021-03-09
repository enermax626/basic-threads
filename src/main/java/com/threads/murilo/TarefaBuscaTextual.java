package com.threads.murilo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

    private String nomeArquivo;
    private String nome;

    public TarefaBuscaTextual(String nomeArquivo, String nome) {
        this.nomeArquivo = nomeArquivo;
        this.nome = nome;
    }

    @Override
    public void run() {

        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));
            String linha;
            long linhaNum = 0;
            while(scanner.hasNextLine()){
                linhaNum++;
                linha = scanner.next();

                if(linha.contains(nome)){
                    System.out.println("Arquivo: "+ nomeArquivo+" linha: "+linhaNum);
                }
            }



            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
