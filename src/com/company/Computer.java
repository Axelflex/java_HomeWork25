package com.company;

public class Computer {
    public int computePlay(){
        return (int) (Math.random() * 3 + 1);
    }
    public int computePlayHardMode(){
        return (int) (Math.random() * 5 + 1);
    }
}
