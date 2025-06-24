package com.jackied.clazz;

import java.util.Scanner;

public class Run implements Runnable {
    private Listen listen;

    public Run(Listen listen) {
        this.listen = listen;
    }

    @Override
    public void run() {
        while (true) {
            Scanner s = new Scanner(System.in);
            String next = s.next();
            if (next.equals("1")) {
                listen.run();
            }
        }
    }
}
