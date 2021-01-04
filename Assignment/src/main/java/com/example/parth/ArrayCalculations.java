package com.example.parth;

import java.util.ArrayList;

public class ArrayCalculations {
    ArrayList<Long> A1=new ArrayList<>();
    ArrayList<Long> A2=new ArrayList<>();

    public ArrayList saveEvenNumbers(int N){

        for (long i=2;i<=N;i=i+2){
            A1.add(i);
        }
        System.out.println(A1);
        return A1;
    }

    public ArrayList printEvenNumbers(){
        for (Long i:A1){
            System.out.print(i*2);
            A2.add((i*2)+i);
        }
        System.out.println();
        System.out.println(A2);
        return A2;
    }
    public void printEvenNumber(int N){
        int flag=0;
        for (long i:A1){
            if (i==N){
                flag=N;
                break;
            }
        }
        System.out.println(flag);
    }
}