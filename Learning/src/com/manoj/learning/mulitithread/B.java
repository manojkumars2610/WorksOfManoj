package com.manoj.learning.mulitithread;

public class B implements Runnable{
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
