package com.manoj.learning.mulitithread;

public class Producer {

    Rice rice;
    public Producer(Rice rice) {
        this.rice = rice;
        Runnable obj = ()-> {
            while (true){
                rice.setRice();
                try { Thread.sleep(1000);} catch (Exception e){}
//                notify();
            }

        };
        Thread p1 = new Thread(obj,"Producer1");
        p1.start();
    }



}
