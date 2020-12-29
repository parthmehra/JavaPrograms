package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Josh", calculateHighScorePosition(1500));
        displayHighScorePosition("Tim", calculateHighScorePosition(900));
        displayHighScorePosition("George", calculateHighScorePosition(400) );
        displayHighScorePosition("Sam", calculateHighScorePosition(50));



    }

    public static int calculateHighScorePosition(int score){
            if (score >= 1000)
                return 1;
            else if (score >= 500 && score < 1000)
                return 2;
            else if (score >= 100 && score < 500)
                return 3;
            else
                return 4;

        }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get to position " + position + " on the high score table");

    }

}
