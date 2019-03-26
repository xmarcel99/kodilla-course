package com.kodilla.rps;

import java.util.Scanner;

public class FinishGame {

    static boolean end = false;
    public static  boolean finishGame() {

        System.out.println("\nWould you like to play again  ? n-Yes x-No");
        System.out.print("=>");
        Scanner input = new Scanner(System.in);
         String again = input.nextLine();

          int userCount = GameProcessor.getUserCount();
          int computerCount = GameProcessor.getComputerCount();

        if (again.equals("n")) {
            computerCount = 0;
            userCount = 0;
        } else if (again.equals("x")) {
            System.out.println("See you later!");
            end = true;
        }
        return  end;
    }
    public static boolean getEnd() {
        return  end;
    }
}
