package com.company;

public class Computer {
    public int computePlay(){
        int rnd = (int) (Math.random() * 3);
        switch (rnd){
            case 0 -> System.out.println(rock_Paper_Scissors.ROCK);
            case 1 -> System.out.println(rock_Paper_Scissors.PAPER);
            case 2 -> System.out.println(rock_Paper_Scissors.SCISSORS);
        }
        return rnd;
    }
}
