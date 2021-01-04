package com.example.parth;

import java.util.ArrayList;

public class ArrayCalculations {
    ArrayList<Long> a1 =new ArrayList<>();
    ArrayList<Long> a2 =new ArrayList<>();

    public ArrayList saveEvenNumbers(long n){

        for (long i=2;i<n+1;i++){
            if(isEven(i)) {
                a1.add(i);
            }
        }
        System.out.println(a1);
        return a1;
    }

    public ArrayList printEvenNumbers(){
        for (Long i: a1){
            long newElement=i*2;
            System.out.print(newElement +" ");
            a2.add(newElement);
        }

        System.out.println("\n" + a2);
        return a2;
    }
    public void printEvenNumber(int n){
        int foundNumber=0;
        for (long i: a1){
            if (i==n){
                foundNumber=n;
                break;
            }
        }
        if(foundNumber!=0) {
            System.out.println(foundNumber);
        } else {
            System.out.println("Number not found");
        }
    }
    public boolean isEven(long n){
        return n % 2 == 0;
    }
}