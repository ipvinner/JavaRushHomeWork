package com.javarush.test.level21.lesson16.big01;
import java.util.ArrayList;

/**
 * Created by ipvinner on 01.05.2015.
 */
public class Hippodrome{

    private static ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 2, 0);
        Horse horse3 = new Horse("horse3", 3, 0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game.run();

        game.printWinner();

    }


    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(500);
        }
    }

    public void move(){
        for (Horse horse : horses) {
            horse.move();
        }

    }

    public void print(){
        for (Horse horse : horses) {
            horse.print();
        }

        System.out.println();
        System.out.println();

    }

    public Horse getWinner(){
        int winnerIndex = 0;
        double maxDistance = horses.get(0).getDistance();
        for (int i = 0; i < horses.size(); i++) {
            if(horses.get(i).getDistance() > maxDistance){
                maxDistance = horses.get(i).getDistance();
                winnerIndex = i;
            }

        }
        return horses.get(winnerIndex);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
