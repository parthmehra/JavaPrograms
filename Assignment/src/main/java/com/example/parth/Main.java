package com.example.parth;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> exampleArray= new ArrayList<>(Arrays.asList(2,3,4,5,6,7));
        ArrayCalculations array=new ArrayCalculations();
        array.saveEvenNumbers(50);
        array.printEvenNumbers();
        array.printEvenNumber(11);
        array.reverseArray(array.getA1());
        array.reverseArray(array.getA2());

    }

}
