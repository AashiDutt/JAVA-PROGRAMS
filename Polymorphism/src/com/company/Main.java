package com.company;

class Movie{    // creating a method
    private String name;
    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "No Plot Here";
    }
}
class Jaws extends Movie{   // extending method from upper(Movie) method
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A Shark Eats Lots of People";
    }
}
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }
    @Override
    public String plot(){
        return "Aleins attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
     public MazeRunner(){
         super("Maze Runner");
     }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}


public class Main {

    public static void main(String[] args) {
     for(int i =1; i<11; i++){
         Movie movie = randomMovie();
         System.out.println("Movie #" + i+ ":" + movie.getClass()+"\n" +"Plot:" + movie.plot() +"\n");
     }
    }

    public static Movie randomMovie(){
        int randomNumber =(int)(Math.random() *5)+1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
        }
        return null;
    }
}
