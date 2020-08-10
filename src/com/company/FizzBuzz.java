package com.company;

import java.util.concurrent.Phaser;

public class FizzBuzz {

    private final String fizz = "Fizz";
    private final String delimiter = ",";
    private final String buzz = "Buzz";
    private final String fizzBuzz = "FizzBuzz";

    private static  Phaser phaser=new Phaser(4) ;
    private int n;


    public FizzBuzz(int n) {
        this.n = n;

    }



    public void fizz(Runnable r) {

        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0 && i % 5 != 0) {
                if (i != n) {
                    System.out.print(fizz + delimiter);
                } else {
                    System.out.print(fizz);
                }
            }
            phaser.arriveAndAwaitAdvance();

        }
    }

    public void buzz(Runnable r) {

        for (int i = 1; i <= n; i++) {


            if (i % 5 == 0 && i % 3 != 0) {
                if (i!=n) {
                    System.out.print(buzz + delimiter);
                } else {
                    System.out.print(buzz );
                }
            }
            phaser.arriveAndAwaitAdvance();

        }

    }

    public void fizzbuzz(Runnable r) {


        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                if (i != n) {

                    System.out.print(fizzBuzz + delimiter);
                } else {
                    System.out.print(fizzBuzz );
                }
            }
            phaser.arriveAndAwaitAdvance();
        }

    }

    public void number(Runnable r) {

        for (int i = 1; i <= n; i++) {


            if (i % 3 != 0 && i % 5 != 0) {
                if (i!=n) {
                    System.out.print(i + delimiter);
                } else {

                    System.out.print(i );
                }
            }
            phaser.arriveAndAwaitAdvance();


        }


    }

}
