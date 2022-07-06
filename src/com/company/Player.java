package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    public int playerPlay(){
        System.out.println("Enter number from 1 to 3\n 1 -> Rock\n 2 -> Paper\n 3 -> Scissors");
        try {
            int num = new Scanner(System.in).nextInt();
            if (num < 4 && num > -1){
                return num;
            }else {
                System.out.println("Wrong number");
            }

        }catch (InputMismatchException e){
            System.out.println("Enter a number");
        }
        return -1;
    }
    public int playerPlayHardMode(){
        System.out.println("Enter number from 1 to 5\n 1 -> Rock\n 2 -> Paper\n 3 -> Scissors\n 4 ->Lizard\n 5 -> Spock");
        try {
            int num = new Scanner(System.in).nextInt();
            if (num < 5 && num > -1){
                return num;
            }else {
                System.out.println("Wrong number");
            }

        }catch (InputMismatchException e){
            System.out.println("Enter a number");
        }
        return -1;
    }
}
