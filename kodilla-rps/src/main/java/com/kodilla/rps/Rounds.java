package com.kodilla.rps;

import java.util.Scanner;

public class Rounds {

    static int x;
    static  String name;
    public static int rounds() {
        Scanner input = new Scanner(System.in);

        System.out.println(">>How many game win to finish?");
        System.out.print("=>");

         x = input.nextInt();


        System.out.println("Game set to  " + x + " wins.");
        return x;
    }
    public static String yourName() {
        System.out.println("| Welcome in Game |");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name ?");
        name = input.nextLine();
        return name;
    }

    public static int getX() {
        return x;
    }

    public static String getName() {return name;}
}
