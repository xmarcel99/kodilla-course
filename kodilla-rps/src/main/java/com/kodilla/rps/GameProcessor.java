package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class GameProcessor {

    static int computerCount  ;
    static int userCount ;


    public static void pointCounter() {


        System.out.println("\nWhat's your move ?:");
        System.out.println("1.Rock.\n2.Paper.\n3.Scissors.\n4.Lizard. \n5.Spock. ");
        System.out.print("=>");
        Scanner input = new Scanner(System.in);




        int user = input.nextInt();
        Random random = new Random();
        int computer = random.nextInt(3) + 1;
        if(user == 1) {
            if (computer == 1 ) {
                System.out.println("Computer chose scissors. You won !");
                userCount++;
            } else if ( computer == 3 || computer == 4) {
                System.out.println("Computer chose paper. You lose !");
                computerCount++;
            }
        } else if (user == 2) {
            if ( computer == 1) {
                System.out.println("Computer chose a rock. You won !");
                userCount++;
            } else if( computer == 3 || computer == 4) {
                System.out.println("Computer chose scissors. You lose !");
                computerCount++;
            }
        } else if (user == 3) {
            if (computer == 1) {
                System.out.println("Computer chose paper. You won !");
                userCount++;
            }  else if (computer == 3 || computer == 4) {
                System.out.println("Computer chose rock. You lose !");
                computerCount++;
            }
        } else if ( user == 4) {
            if (computer == 1) {
                System.out.println("Computer chose Spock. You won !");
                userCount++;
            }  else  if(computer == 3 || computer == 4) {
                System.out.println("Computer chose scissors. You lose !");
                computerCount++;
            }
        } else if ( user == 5) {
            if(computer == 1) {
                System.out.println("Computer choce scissors. You won !");
                userCount++;
            }  else if(computer == 3 || computer == 4) {
                System.out.println("Computer chose paper. You lose !");
                computerCount++;
            }


        }
        if(computer == 2) {
            System.out.println("Draw, Both chose the same!!");
        }
        System.out.println("Computer: " + computerCount + "    "+ Input.getName()+": " + userCount);

    }

    public static int getComputerCount() {
        return computerCount;
    }
    public static int getUserCount() {
        return userCount;
    }

    public static int setComputerCount(int set) {
        computerCount = set;
        return computerCount;
    }
    public static int setUserCount(int set) {
        userCount = set;
        return userCount;
    }

}
