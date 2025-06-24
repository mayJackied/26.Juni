package com.jackied.clazz;

import java.util.Scanner;

public class Clazz implements Listen{
    public void one(){
        Runnable runnable = new Run(this);
        Thread t = new Thread(runnable);
        t.start();
    }

    public void two(){
        System.out.println("OK");
    }

    @Override
    public void run() {
        two();
    }
}
