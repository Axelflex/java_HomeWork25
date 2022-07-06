package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    public int playerPlay(){
        System.out.println("Enter number from 1 to 3\n 1 -> Rock\n 2 -> Paper\n 3 -> Scissors");
        try {
            int num = new Scanner(System.in).nextInt()-1;
            if (num < 3 && num > -1){
                switch (num){
                    case 0 -> System.out.println(rock_Paper_Scissors.ROCK);
                    case 1 -> System.out.println(rock_Paper_Scissors.PAPER);
                    case 2 -> System.out.println(rock_Paper_Scissors.SCISSORS);
                }
            }else {
                System.out.println("Wrong number");
            }
            return num;
        }catch (InputMismatchException e){
            System.out.println("Enter a number");
        }
        return -1;
    }
}
