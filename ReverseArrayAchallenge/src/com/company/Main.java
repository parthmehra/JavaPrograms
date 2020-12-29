package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        int capacity=4;
        int[] array = new int[capacity];
        System.out.println("The entered integers are: \r");
        for(int i=0; i<capacity; i++){
            array[i]=scan.nextInt();
        }
        System.out.println("The reversed array is "+Arrays.toString(reverse(array)));
    }

    private static int[] reverse(int[] array){
        int maxIndex= array.length-1;
        int halfLength=array.length/2;
        for (int i=0;i<halfLength;i++){
            int temp=array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    return array;
    }
}
