package com.example.Threads;

import static com.example.Threads.ThreadColor.*;

public class Main {
    public static void main(String[] args){
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread thread=new AnotherThread();
        thread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread");

    }
}



