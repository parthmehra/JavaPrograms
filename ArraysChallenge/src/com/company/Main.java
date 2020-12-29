package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {


    printArray(sorting(getIntegers(6)));

    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("The "+ capacity+ " entered integers are: \r");
        for(int i=0; i<capacity; i++){
            array[i]=scanner.nextInt();
        }
    return array;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length; i++){
            System.out.println("Element "+i+" contains "+array[i]);
        }
    }
    public static int[] sorting(int[] array){
        int[] sortedArray=new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        //or you can use for loop to copy the array
        int temp;
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i< array.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }

    return sortedArray;
    }
}
