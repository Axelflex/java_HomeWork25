package com.company;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {run();}
    public static void run(){
        System.out.println("""
                1 -> to play normal mode
                2 -> to play hard mode""");
        int chooseGame = new Scanner(System.in).nextInt();
        if(chooseGame == 1){
            Game1.startGame();
        }else {
            Game2.startGame();
        }
    }
}






















