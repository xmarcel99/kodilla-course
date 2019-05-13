package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {

        User user = null;
        MessageSender messageSender = new MessageSender();


        try {
            messageSender.sendMessageTo(user, "Test message");
        } catch (MessageNotSentException e) {

            System.out.println("Ups.... something went wrong: " + e);
        } finally {
            System.out.println("Phones are good");
        }
    }
}
