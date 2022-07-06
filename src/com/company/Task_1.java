package com.company;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {run();}
    public static void run(){
        ScoringSystem ss = new ScoringSystem();
        Computer computer = new Computer();
        Player player = new Player();
        int win = 0;
        int lose = 0;
        int draw = 0;
        int amountOfGames = 0;
        while (true){
            System.out.println("""
                1 -> To get results end stop the game enter number
                2 -> To continue""");
            int game = new Scanner(System.in).nextInt();
            switch (game){
                case 1 -> {
                    ss.wins(win);
                    ss.loses(lose);
                    ss.draws(draw);
                    ss.games(amountOfGames);
                    ss.printTable();
                }
                case 2 -> {
                    int comp = computer.computePlay();
                    int plr = player.playerPlay();
                    amountOfGames++;
                    if(plr > 4 || plr == -1){
                        System.out.println();
                    }else {
                        if(comp == 1 && plr == 3){
                            System.out.println("Pc wins");
                            lose++;
                        }else if(comp == 2 && plr == 1){
                            System.out.println("Pc wins");
                            lose++;
                        }else if(comp == 3 && plr == 2){
                            System.out.println("Pc wins");
                            lose++;
                        }else if(comp == plr){
                            System.out.println("Draw");
                            draw++;
                        }else {
                            System.out.println("Player wins");
                            win++;
                        }
                    }
                }
            }
            if (game == 1){
                break;
            }
        }
    }
}






















