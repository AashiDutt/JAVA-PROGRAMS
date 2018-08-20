// This code is to demonstrate Method Overloading .
// Means using same method again and again with same name but passing different parameters

package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Aashi", 500);
        System.out.println("NewScore is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName +"scored " + score + " points");
        return score * 1000;
    }


    public static int calculateScore(int score){
        System.out.println("Unamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No Player Name, No Player Score");
        return 0;
    }

}
