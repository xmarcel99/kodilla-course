package com.kodilla.rps;

import java.util.Scanner;

public class Input {

    static int roundCounter;
    static String name;
    static boolean end = false;
    static Scanner input = new Scanner(System.in);

    public static void askingHowManyRoundToWin() {
        System.out.println(">>How many game win to finish?");
        System.out.print("=>");
        roundCounter = input.nextInt();
        System.out.println("Game set to  " + roundCounter + " wins.");

    }

    public static void askingAboutPlayerName() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("| Welcome in Game |");
        System.out.println();

        System.out.println("What's your name ?");
        name = input1.nextLine();

    }


    public static int getRoundsToWin() {
        return roundCounter;
    }

    public static String getName() {
        return name;
    }


    public static void askingAboutLeaveGameOrPlayAgain() {

        System.out.println("\nWould you like to play again  ? n-Yes x-No");
        System.out.print("=>");
        Scanner readplayagain = new Scanner(System.in);
        String again = readplayagain.nextLine();


        if (again.equals("n")) {
            end = false;
            GameProcessor.setComputerCount(0);
            GameProcessor.setUserCount(0);

        } else if (again.equals("x")) {
            System.out.println("See you later!");
            end = true;
        }

    }

    public static boolean getEnd() {
        return end;
    }
}
