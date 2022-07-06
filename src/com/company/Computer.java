package com.company;

public class Computer {
    public int computePlay(){
        int rnd = (int) (Math.random() * 3);
        switch (rnd){
            case 0 -> System.out.println("Rock");
            case 1 -> System.out.println("Paper");
            case 2 -> System.out.println("Scissors");
        }
        return rnd;
    }
}
