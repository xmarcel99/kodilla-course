package com.kodilla.good.patterns.challenges.flightApplication;

import java.util.Scanner;

public class InputData {
    public static int startApplication() {
        System.out.println("        <<< --- FLIGHT FINDER --- >>>");
        System.out.println("Finding all flights from the given city  ---  press 1");
        System.out.println("Finding all flights to the given city  ---  press 2");
        System.out.println("Finding flights through another given city  ---  press 3");
        Scanner chooseOption = new Scanner(System.in);
        int optionNUmber = chooseOption.nextInt();
        return optionNUmber;
    }

    public static String enterCountry() {
        Scanner cityInput = new Scanner(System.in);
        String city = cityInput.nextLine();
        return city;
    }
}
