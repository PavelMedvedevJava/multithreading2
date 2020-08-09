package com.company;

public class B implements Runnable {

    FizzBuzz fizzBuzz ;

    public B(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
        new Thread(this, "b").start();
    }

    @Override
    public void run() {
fizzBuzz.buzz(this);

        }
    }

