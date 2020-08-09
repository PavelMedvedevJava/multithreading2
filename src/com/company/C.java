package com.company;

public class C implements Runnable {


    FizzBuzz fizzBuzz ;

    public C(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;

        new Thread(this,"c").start();
    }

    @Override
    public void run() {

fizzBuzz.fizzbuzz(this);

    }
}
