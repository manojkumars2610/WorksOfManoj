package com.manoj.learning.mulitithread;

public class Consumer {

    Rice rice;

    public Consumer(Rice r) {

        Runnable obj = ()-> {
            while (true) {
                r.getRice();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
//                notify();
            }
        };
        Thread c1 = new Thread(obj,"Consumer1");
        c1.start();
    }

   }
