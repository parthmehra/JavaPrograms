package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(330092));
    }
    public static int sumFirstAndLastDigit(int number){
        int lastDigit=0;
        int firstDigit=0;
        lastDigit=number%10;
        if(number<0)
            return -1;
        while(number!=0){
            firstDigit=number%10;
            number=number/10;
        }

        int sum=firstDigit+lastDigit;
        return sum;

    }
}
