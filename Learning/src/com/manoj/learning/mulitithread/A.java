package com.manoj.learning.mulitithread;

public class A implements Runnable{
    public void run() {
        for (int i = 1; i <=  10; i++) {
            System.out.println(i);
        }
    }

}
