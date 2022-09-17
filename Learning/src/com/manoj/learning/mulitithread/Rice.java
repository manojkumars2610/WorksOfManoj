package com.manoj.learning.mulitithread;

public class Rice {
    int quantity;

    public Rice() {
        this.quantity = 0;
    }

    public void getRice() {
        System.out.println("GET::: Rice available = "+this.quantity);
//        this.quantity--;

    }

    public void setRice() {
        System.out.println("SET::: Rice available = "+this.quantity);
        this.quantity++;
    }
}
