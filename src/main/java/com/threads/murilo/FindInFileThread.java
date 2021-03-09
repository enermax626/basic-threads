package com.threads.murilo;

public class FindInFileThread {

    public static void main(String[] args) {




        Thread t = new Thread(() -> {
            for(int i=0;i<1000;i++){
                System.out.println("value: "+i+" ThreadID: "+Thread.currentThread().getId());
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                System.out.println("value: "+i+" ThreadID: "+Thread.currentThread().getId());
            }
        });


        t.start();
        t2.start();


    }
}
