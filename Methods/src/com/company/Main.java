// Code to create a new Method

package com.company;

public class Main {

    public static void main(String[] args) {   // this is a method

        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;
        if (gameover) {

            int finalscore;

            finalscore = calculate(gameover, score, levelcompleted, bonus);   // Calling Method by passing values
            System.out.println("Your final score is " + finalscore);

            //calculate(true, 1000, 4, 100);

            System.out.println("GoodBye!!");
        }
    }

    // Creating a new Method (private)

    private static int calculate(boolean gameover, int score, int levelcompleted, int bonus) {


        if (gameover) {
            int finalscore = score + (bonus * levelcompleted);
            //System.out.println("Your final score is " + finalscore);
            return finalscore;
        }
        return -1;
    }

}
