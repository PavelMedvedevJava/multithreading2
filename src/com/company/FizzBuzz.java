package com.company;

import java.util.concurrent.Phaser;

public class FizzBuzz {


    private static  Phaser phaser=new Phaser(4) ;


    private int n;


    public FizzBuzz(int n) {
        this.n = n;

    }



    public void fizz(Runnable r) {

        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("fizz,");
            }
            phaser.arriveAndAwaitAdvance();

        }
    }

    public void buzz(Runnable r) {

        for (int i = 1; i <= n; i++) {


            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print("buzz,");
            }
            phaser.arriveAndAwaitAdvance();

        }

    }

    public void fizzbuzz(Runnable r) {


        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz,");
            }
            phaser.arriveAndAwaitAdvance();
        }

    }

    public void number(Runnable r) {

        for (int i = 1; i <= n; i++) {


            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + ",");
            }
            phaser.arriveAndAwaitAdvance();


        }


    }

}
