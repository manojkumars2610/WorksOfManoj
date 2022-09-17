package com.manoj.learning.java;


import com.manoj.learning.java.exceptions.MyException;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int i, int j) {
        // TODO Auto-generated method stub
        return j - i;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        if(j==0){
            throw new MyException("Cannot divide by 0.");
        }
        return i / j;
    }

}
