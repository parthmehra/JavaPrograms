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

        String str = "Quantiphi Bayer Radimetrics";
        char[] tempArray = str.toCharArray();
        int left, right = 0;
        right = tempArray.length - 1;

        for (left = 0; left < right; left++) {
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
            right--;
        }

        for (char c : tempArray)
            System.out.print(c);

    }

}


