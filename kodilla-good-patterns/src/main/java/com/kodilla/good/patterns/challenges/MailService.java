package com.kodilla.good.patterns.challenges;

public class MailService implements  InformationOrder {
    public void inform(User user) {
        System.out.println("Sending email to: " + user.name + " " + user.surname);
    }
}
