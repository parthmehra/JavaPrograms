package com.company;

public class Main {

    public static void main(String[] args) {
    double firstVar=20.00d;
    double secondVar=80.00d;
    double totalVar=(firstVar+secondVar)*100.00d;
    double remainderVar=totalVar%40.00d;
        System.out.println(remainderVar);
    boolean isZero=(remainderVar==0) ? true : false;
        System.out.println(isZero);

        if(!isZero)
            System.out.println("Got some remainder");
    }
}
