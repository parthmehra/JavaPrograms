package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 0));

    }
         public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
            if (barking==true && (hourOfDay<8 && hourOfDay>=0) || (hourOfDay<=23 && hourOfDay>22))
                return true;
            else
                return false;


    }
}
