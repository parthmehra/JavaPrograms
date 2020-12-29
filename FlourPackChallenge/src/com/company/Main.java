package com.company;

public class Main {

    public static void main(String[] args) {

	    }
	    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount<0 || smallCount<0 || goal<0)
            return false;

        else if (bigCount*5+smallCount<goal)
            return false;

        else
            return (smallCount>=goal%5 && bigCount*5>goal || bigCount*5==goal);
        }
}
