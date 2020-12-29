package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    inputThenPrintSumAndAverage();
    }
        public static void inputThenPrintSumAndAverage(){
            int sum=0;
            int count=0;

            Scanner sc=new Scanner(System.in);
            while (true){
                System.out.println("Enter the Number: ");
                boolean isInt= sc.hasNextInt();

                if(isInt){
                    int number= sc.nextInt();
                    sum+= number;
                    count++;
                }
                else{
                    break;
                }
                sc.nextLine();
            }

            System.out.println("SUM = "+sum+" AVG = "+Math.round((double)sum/count));

            sc.close();
        }
}
