package com.company;

public class D implements Runnable {

    FizzBuzz fizzBuzz ;


    public D(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
        new Thread(this,"d").start();
    }

    @Override
    public void run() {

fizzBuzz.number(this);
        }
    }

