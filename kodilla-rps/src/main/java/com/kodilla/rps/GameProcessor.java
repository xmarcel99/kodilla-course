package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class GameProcessor {

    static int computerCount;
    static int userCount;
    public static void gameProcessor() {

        System.out.println("\nWhat's your move ?:");
        System.out.println("1.Rock.\n2.Paper.\n3.Scissors.\n ");
        System.out.print("=>");
        Scanner input = new Scanner(System.in);




        int user = input.nextInt();
        Random losuj = new Random();
        int computer = losuj.nextInt(2) + 1;
        if ( user == 1 && computer == 3) {
            System.out.println("Computer chose scissors. You won!!");
            userCount++;
        } else if (user == 1 && computer == 2) {
            System.out.println("Computer chose paper. You lose!!");
            computerCount++;
        } else if (user == 2 && computer == 1) {
            System.out.println("Computer chose a rock. You won!!");
            userCount++;
        } else if (user == 2 && computer == 3) {
            System.out.println("Computer chose scissors. You lose!!");
            computerCount++;
        } else if (user== 3 && computer== 1) {
            System.out.println("Computer chose a rock. You lose !!");
            computerCount++;
        } else if (user== 3 && computer == 2) {
            System.out.println("Computer chose paper. You won!!");
            userCount++;
        } else {
            System.out.println("Draw, Both chose the same!!");
        }
        System.out.println("Computer: " + computerCount + "    "+ Rounds.getName()+": " + userCount);

    }

    public static int getComputerCount() {
        return computerCount;
    }
    public static int getUserCount() {
        return userCount;
    }
}
