package com.company;

public class Computer {
    public int computePlay(){
        int rnd = (int) (Math.random() * 3 + 1);
        return rnd;
    }
}
