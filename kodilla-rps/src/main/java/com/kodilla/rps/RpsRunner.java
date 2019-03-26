package com.kodilla.rps;


public class RpsRunner {


    public static void main(String args[])  {

        int computerCount = 0, userCount = 0;

        while (!Input.getEnd()) {
            Input.askingAboutPlayerName();
            Input.askingHowManyRoundToWin();
            while (userCount < Input.getX() && computerCount < Input.getX()) {
                GameProcessor.pointCounter();
                 computerCount = GameProcessor.getComputerCount();
                 userCount = GameProcessor.getUserCount();
            }
            Output.printingWinner();
            Input.askingAboutLeaveGameOrPlayAgain();
        }
    }
}