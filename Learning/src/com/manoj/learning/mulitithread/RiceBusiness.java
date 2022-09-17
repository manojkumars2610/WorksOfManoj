package com.manoj.learning.mulitithread;

public class RiceBusiness {
    public static void main(String[] args) {
        Rice r = new Rice();
        Producer prod1= new Producer(r);
        Consumer cons1= new Consumer(r);

    }
}
