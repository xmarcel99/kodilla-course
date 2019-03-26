package com.kodilla.rps;

import java.util.Scanner;

public class Input {

    static int x;
    static  String name;
    static boolean end = false;

    public static void askingHowManyRoundToWin() {
        Scanner input = new Scanner(System.in);

        System.out.println(">>How many game win to finish?");
        System.out.print("=>");

        x = input.nextInt();


        System.out.println("Game set to  " + x + " wins.");

    }

    public static void askingAboutPlayerName() {
        System.out.println("| Welcome in Game |");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name ?");
        name = input.nextLine();

    }


    public static int getRoundsToWin() {
        return x;
    }

    public static String getName() {return name;}




    public static  void askingAboutLeaveGameOrPlayAgain() {

        System.out.println("\nWould you like to play again  ? n-Yes x-No");
        System.out.print("=>");
        Scanner input = new Scanner(System.in);
        String again = input.nextLine();



        if (again.equals("n")) {
            end = false;
        } else if (again.equals("x")) {
            System.out.println("See you later!");
            end = true;
        }

    }
    public static boolean getEnd() {
        return  end;
    }
}
