package com.company;

public class A implements Runnable {


    FizzBuzz fizzBuzz ;

    public A(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
        new Thread(this,"a").start();
    }

    @Override
    public void run() {
fizzBuzz.fizz(this);

    }
}
