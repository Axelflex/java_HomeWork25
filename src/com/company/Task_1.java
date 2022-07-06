package com.company;

public class Task_1 {

    public static void main(String[] args) {run();}
    public static void run(){
        Computer computer = new Computer();
        Player player = new Player();
        int win = 0;
        int lose = 0;
        int draw = 0;
        while (true){
            int comp = computer.computePlay();
            int plr = player.playerPlay();
            if(plr > 4 || plr == -1){
                System.out.println();
            }else {
                if(comp == 1 && plr == 3){
                    System.out.println("pc wins");
                    System.out.println(comp + " " + plr);
                    lose++;
                }else if(comp == 2 && plr == 1){
                    System.out.println("pc wins");
                    System.out.println(comp + " " + plr);
                    lose++;
                }else if(comp == 3 && plr == 2){
                    System.out.println("pc wins");
                    System.out.println(comp + " " + plr);
                    lose++;
                }else if(comp == plr){
                    System.out.println("-----");
                    System.out.println(comp + " " + plr);
                    draw++;
                }else {
                    System.out.println("player wins");
                    System.out.println(comp + " " + plr);
                    win++;
                }
            }

        }

    }
}






















