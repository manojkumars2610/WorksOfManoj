package com.manoj.learning.mulitithread;

public class ThreadDemo {

    public static void main(String[] args) {

//    A obj1 = new A();
//    B obj2 = new B();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 11; i <= 20; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("First");
        t1.setPriority(5);
        t2.setName("Second");
        t2.setPriority(10);


        t1.start();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        t2.start();

        try {
            t1.join();

            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye Bye");


    }
}
