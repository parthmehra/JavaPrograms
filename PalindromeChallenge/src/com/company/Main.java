package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }
    public static boolean isPalindrome(int number){
        int reverse=0;
        int tempNum=number;
        while(tempNum>0){
            int lastDigit=tempNum%10;
            reverse=reverse*10;
            reverse=reverse+lastDigit;
            tempNum=tempNum/10;

        }
        return (reverse==number);


    }
}
