package com.jackied.clazz;

import java.util.Scanner;

public class Clazz {
    public void one(){
        Runnable runnable = new Run();
        Thread t = new Thread(runnable);
        t.start();
    }

    public void two(){
        System.out.println("OK");
    }
}
