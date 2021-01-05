package com.example.parth;

import java.util.ArrayList;

public class ArrayCalculations {
   public ArrayList<Integer> a1 =new ArrayList<>();
   public ArrayList<Integer> a2 =new ArrayList<>();

    public ArrayList saveEvenNumbers(int n){

        for (int i=2;i<n+1;i++){
            if(isEven(i)) {
                a1.add(i);
            }
        }
        System.out.println(a1);
        return a1;
    }

    public ArrayList printEvenNumbers(){
        for (int i: a1){
            int newElement=i*2;
            a2.add(newElement);
        }

        System.out.println(a2);
        return a2;
    }

    public void printEvenNumber(int n){
        int foundNumber=0;
        for (int i: a1){
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
    public boolean isEven(int n){
        return n % 2 == 0;
    }
    public void reverseArray(ArrayList<Integer> someArray){

        int lastValue=someArray.size()-1;
        int temp=0;
        for(int i=0;i<lastValue;i++){
            temp= someArray.remove(lastValue);
            someArray.add(i,temp);
        }
        System.out.println(someArray);

    }
    public ArrayList<Integer> getA1(){
        return a1;
    }
    public ArrayList<Integer> getA2() {
        return a2;
    }

}