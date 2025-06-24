package com.jackied.clazz;

import java.util.Scanner;

public class Run implements Runnable{
    @Override
    public void run() {
        while (true){
            Scanner s = new Scanner(System.in);
            String next = s.next();
            if (next.equals("1")){
                //执行 two 方法
            }
        }
    }
}
