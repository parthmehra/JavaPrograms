package com.example.Threads;
import static com.example.Threads.ThreadColor.ANSI_BLUE;

class AnotherThread extends Thread {

    @Override
    public void run(){
        System.out.println(ANSI_BLUE + "Hello from another thread");
    }
}

