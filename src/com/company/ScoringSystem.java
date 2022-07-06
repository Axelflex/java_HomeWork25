package com.company;

public class ScoringSystem {
    int win;
    int lose;
    int draw;
    int games;
    public void wins(int win){
        this.win = win;
    }
    public void loses(int lose){
        this.lose = lose;
    }
    public void draws(int draw){
        this.draw = draw;
    }
    public void games (int games){
        this.games = games;
    }
    public float percentage(){
        if(lose > 0){
            return (float) (100 / lose);
        }else {
            return 100;
        }
    }
    public void printTable(){
        System.out.printf("""
                +-----------------------------------------------------+
                | Wins | Loses | Draws | Total games | Win percentage |
                |-----------------------------------------------------|
                |    %s |     %s |     %s |           %s |          %5s |
                +-----------------------------------------------------+
                """, win, lose, draw, games, percentage());
    }
}
