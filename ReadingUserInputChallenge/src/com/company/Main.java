package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int count=1;
        int sum=0;
        while(count<11){
            System.out.println("Enter Number # "+ count + " :");

            boolean isItInteger=scanner.hasNextInt();
            if(isItInteger){
                int number=scanner.nextInt();
                count++;
                sum=sum+number;

            }
            else{
                System.out.println("Invalid number");


            }
            scanner.nextLine();



        }
        System.out.println("The sum is "+ sum);
        scanner.close();
    }



}
