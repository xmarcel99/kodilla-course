package com.kodilla.rps;


import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class RpsRunner {


    public static void main(String args[])  {

        System.out.println("| Welcome in Game |");
        int x, computer, user, computerCount = 0, userCount = 0,  again;
        boolean end = false;

        while (!end) {
            System.out.println(">>How many game win to finish?");
            System.out.print("=>");
            Scanner input = new Scanner(System.in);
            x = input.nextInt();


            System.out.println("Game set to  " + x + " wins.");
            while (userCount < x && computerCount < x) {
                System.out.println("\nWhat's your move ?:");
                System.out.println("1.Rock.\n2.Paper.\n3.Scissors.");
                System.out.print("=>");

                user = input.nextInt();


                Random losuj = new Random();
                computer = losuj.nextInt(2) + 1;
                if (user == 1 && computer == 3) {
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
                System.out.println("Computer: " + computerCount + "    Player: " + userCount);
            }
            if (userCount > computerCount) {
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
            System.out.println("\nWould you like to play again  ? 1-Yes 2-No");
            System.out.print("=>");
            again = input.nextInt();


            if (again == 1) {
                computerCount = 0;
                userCount = 0;
            } else if (again == 2) {
                System.out.println("See you later!");
                end = true;
            }
        }
    }
}