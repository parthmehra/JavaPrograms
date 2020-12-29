package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(200);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet>=0 && (inches>=0 && inches<=12)) {
            double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
            System.out.println("Calculated centimeters = " + centimeters);
            return centimeters;
        }
        else
            System.out.println("Invalid Parameters");
            return -1;

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double remFeet=(int) inches/12;
            double remInches=(int) inches%12;
            System.out.println("Given inches is = " + remFeet + " feet and " + remInches + " inches");
            return calcFeetAndInchesToCentimeters(remFeet, remInches);
        }
        else
            System.out.println("Invalid Parameters");
            return -1;

    }
}
