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
}
