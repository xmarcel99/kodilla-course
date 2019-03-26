package com.kodilla.rps;

public class ShowWinner {

    public static void showWInner() {
        int userCount = GameProcessor.getUserCount();
        int computerCount = GameProcessor.getComputerCount();

        if (userCount > computerCount ) {
            System.out.println();
            System.out.println("| You win ! |\n| Result  " + computerCount + ":" + userCount + " |");
            System.out.println();
        } else if (computerCount > userCount) {
            System.out.println();
            System.out.println("| You lose !|\n| Result " + computerCount + ":" + userCount + " |");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("| Draw | Result  " + computerCount + ":" + userCount + " |");
            System.out.println();
        }
    }
}
