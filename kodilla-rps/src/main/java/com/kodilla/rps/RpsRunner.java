package com.kodilla.rps;


public class RpsRunner {


    public static void main(String args[])  {

        int computerCount = 0, userCount = 0;

        while (!FinishGame.getEnd()) {
            Rounds.yourName();
            Rounds.rounds();
            while (userCount < Rounds.getX() && computerCount < Rounds.getX()) {
                GameProcessor.gameProcessor();
                 computerCount = GameProcessor.getComputerCount();
                 userCount = GameProcessor.getUserCount();
            }
            ShowWinner.showWInner();
            FinishGame.finishGame();
        }
    }
}