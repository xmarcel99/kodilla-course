package com.kodilla.rps;


public class RpsRunner {


    public static void main(String args[])  {

         int userCount = GameProcessor.setUserCount(0);
         int computerCount = GameProcessor.setComputerCount(0);

        while (!Input.getEnd()) {
            Input.askingAboutPlayerName();
            Input.askingHowManyRoundToWin();

            while (userCount < Input.getRoundsToWin() && computerCount < Input.getRoundsToWin()) {
                GameProcessor.pointCounter();
                 computerCount = GameProcessor.getComputerCount();
                 userCount = GameProcessor.getUserCount();
            }
            Output.printingWinner();
            Input.askingAboutLeaveGameOrPlayAgain();
        }
    }
}